package com.lmig.gfc.roadgameraterbe.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/ratinginfo")
public class RatingInfoApiController {

	private RatingInfoRepository ratingInfoRepo;

	public RatingInfoApiController(RatingInfoRepository ratingInfoRepo) {
		this.ratingInfoRepo = ratingInfoRepo;
		
	}
	//get all the rating info in the rating info repo
	@GetMapping("")
	public List<RatingInfo> getAll() {
		return ratingInfoRepo.findAll();
	}

	//get one rate info based on ratinginfo id
	@GetMapping("{id}")
	public RatingInfo getOne(@PathVariable Long id) {
		return ratingInfoRepo.findOne(id);

	}

	//save a instance of ratinginfo to the repo
	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RatingInfo create(@RequestBody RatingInfo info, Authentication auth) {
		return ratingInfoRepo.save(info);
	}

	@PutMapping("{id}")
	public RatingInfo update(@RequestBody RatingInfo info, @PathVariable Long id) {
		info.setId(id);
		return ratingInfoRepo.save(info);
	}

	@DeleteMapping("{id}")
	public RatingInfo delete(@PathVariable Long id) {
		RatingInfo info = ratingInfoRepo.findOne(id);
		ratingInfoRepo.delete(id);
		return info;
	}

}
