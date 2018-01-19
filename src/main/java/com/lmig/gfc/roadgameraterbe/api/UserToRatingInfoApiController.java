package com.lmig.gfc.roadgameraterbe.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.models.User;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;
import com.lmig.gfc.roadgameraterbe.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user/{id}")
public class UserToRatingInfoApiController {

	private RatingInfoRepository ratingInfoRepo;
	private PlaceRepository placeRepo;
	private UserRepository userRepo;

	public UserToRatingInfoApiController(RatingInfoRepository ratingInfoRepo,
			UserRepository userRepo, PlaceRepository placeRepo) {
		this.ratingInfoRepo = ratingInfoRepo;
		this.placeRepo = placeRepo;
		this.userRepo = userRepo;
	}

//	@PostMapping("")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Place create(@PathVariable Long placeId, @RequestBody RatingInfo ratingInfo, Authentication auth) {
//		Long userId = (((User) auth.getPrincipal()).getId());
//		User user = userRepo.findOne(userId);
//		Place place = placeRepo.findOne(placeId);
//
//		List<RatingInfo> identifiedList = ratingInfoRepo.findByPlaceIdAndUserId(placeId, userId);
// 
//		//System.out.println(identifiedList);
//		if (identifiedList.isEmpty()) {
//			ratingInfo.setPlace(place);
//			ratingInfo.setUser(user);
//			place.getRatingInfo().add(ratingInfo);
//			ratingInfoRepo.save(ratingInfo);
//			return place;
//		}
//
//		return place;
//	}

//	@GetMapping("")
//	public List<RatingInfo> getAll(Authentication auth) {
//		Long userId = (((User) auth.getPrincipal()).getId());
//		
//		return ratingInfoRepo.findByUserId(userId);
//	}
	
	@GetMapping("")
	public List<RatingInfo> getAll(Authentication auth) {
		Long userId = (((User) auth.getPrincipal()).getId());
		
//		List<RatingInfo> identifiedList = ratingInfoRepo.findByUserId(userId);
//		placeRepo.findById(placeId)
//		System.out.print(identifiedList);
		return ratingInfoRepo.findByUserId(userId);
	}

}

