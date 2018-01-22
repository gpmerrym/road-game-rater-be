package com.lmig.gfc.roadgameraterbe.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.models.RatingInfoView;
import com.lmig.gfc.roadgameraterbe.models.User;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;
import com.lmig.gfc.roadgameraterbe.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user/{id}")
public class UserToRatingInfoApiController {

	private RatingInfoRepository ratingInfoRepo;

	public UserToRatingInfoApiController(RatingInfoRepository ratingInfoRepo, UserRepository userRepo,
			PlaceRepository placeRepo) {
		this.ratingInfoRepo = ratingInfoRepo;

	}

	@GetMapping("")
	public List<RatingInfoView> getAll(Authentication auth) {
		Long userId = (((User) auth.getPrincipal()).getId());
		List<RatingInfo> ratings = ratingInfoRepo.findByUserId(userId);
		ArrayList<RatingInfoView> ratingViews = new ArrayList<RatingInfoView>();
		for (RatingInfo rates : ratings) {
			ratingViews.add(new RatingInfoView(rates));
		}
		return ratingViews;

	}

}
