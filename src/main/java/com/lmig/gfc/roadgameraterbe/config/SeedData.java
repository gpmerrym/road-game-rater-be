package com.lmig.gfc.roadgameraterbe.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;

@Configuration
public class SeedData {
	
	public SeedData(PlaceRepository placeRepo, RatingInfoRepository ratingInfoRepo) {
		placeRepo.save(new Place("McDonalds", "1223 Testing Street"));
		placeRepo.save(new Place("Wendys", "88113 Oxford Way"));
		placeRepo.save(new Place("Target", "2332 Fire Way"));
		
		ratingInfoRepo.save(new RatingInfo(1, true, true, true, "awesome"));
		ratingInfoRepo.save(new RatingInfo(3, true, true, false, "meh"));
		//ratingInfoRepo.save(new RatingInfo(""));
		
	}



}
