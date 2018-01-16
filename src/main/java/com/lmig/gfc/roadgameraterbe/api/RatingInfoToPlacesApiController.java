package com.lmig.gfc.roadgameraterbe.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/places/{placeId}/ratinginfo")
public class RatingInfoToPlacesApiController {

	private RatingInfoRepository ratingInfoRepo;
	private PlaceRepository placeRepo;

	public RatingInfoToPlacesApiController(RatingInfoRepository ratingInfoRepo, PlaceRepository placeRepo) {
		this.ratingInfoRepo = ratingInfoRepo;
		this.placeRepo = placeRepo;
	}

	@PostMapping("")
	public Place create(@PathVariable Long placeId, @RequestBody RatingInfo ratingInfo) {
		Place place = placeRepo.findOne(placeId);
		if (!place.getRatingInfo().contains(ratingInfo)) {
			place.getRatingInfo().add(ratingInfo);
			ratingInfo.setId(placeId);
			ratingInfo.setPlace(place);
			ratingInfoRepo.save(ratingInfo);
		}

		return place;
	}

	@GetMapping("")
	public List<RatingInfo> getAll(@PathVariable Long placeId) {
		return ratingInfoRepo.findByPlaceId(placeId);
	}

}
