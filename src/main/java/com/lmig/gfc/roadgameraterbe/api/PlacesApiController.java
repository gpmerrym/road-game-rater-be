package com.lmig.gfc.roadgameraterbe.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/places")
public class PlacesApiController {

	private PlaceRepository placeRepo;

	public PlacesApiController(PlaceRepository placeRepo) {
		this.placeRepo = placeRepo;
	}
	//get all the places in the places repository
	@GetMapping("")
	public List<Place> getAll() {
		return placeRepo.findAll();
	}
	//get one place by google id
	@GetMapping("/googleId/{googleId}")
	public Place getOne(@PathVariable String googleId) {
		return placeRepo.findByGoogleId(googleId);
		
	}
	//get one place by place id
	@GetMapping("{id}")
	public Place getOne(@PathVariable Long id) {
		return placeRepo.findOne(id);

	}

	//post place to the place repo (database)
	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Place create(@RequestBody Place place) {
		String googleId = place.getGoogleId();
		Place identifiedPlace = placeRepo.findByGoogleId(googleId);

		if (identifiedPlace == null) {
			return placeRepo.save(place);
		}
		return identifiedPlace;

	}
	//update the contents of a place
	@PutMapping("{id}")
	public Place update(@RequestBody Place place, @PathVariable Long id) {
		place.setId(id);
		return placeRepo.save(place);
	}

	//delete a place based on place id
	@DeleteMapping("{id}")
	public Place delete(@PathVariable Long id) {
		Place place = placeRepo.findOne(id);
		placeRepo.delete(id);
		return place;
	}

}
