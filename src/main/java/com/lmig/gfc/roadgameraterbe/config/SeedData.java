package com.lmig.gfc.roadgameraterbe.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;

@Configuration
public class SeedData {
	
	public SeedData(PlaceRepository placeRepo, RatingInfoRepository ratingInfoRepo) {
		
		List<RatingInfo> ratingInfo = new ArrayList<RatingInfo>();
		
		
		Place place1 = new Place("McDonalds", "1223 Pepsi Avenue");
		Place place2 = new Place("Target", "1223 Water Street");
		Place place3 = new Place("Wendys", "44333 Wall Ave");
		Place place4 = new Place("Wallgreens", "55433 Dog Ave");
		Place place5 = new Place("Subway", "453 Gatorade Street");
		
		
		RatingInfo info1 = new RatingInfo(1, false, false, false, "sucks");
		RatingInfo info2 = new RatingInfo(3, true, false, true, "average");
		RatingInfo info3 = new RatingInfo(4, false, true, true, "good");
		RatingInfo info4 = new RatingInfo(5, true, true, true, "great");
		RatingInfo info5 = new RatingInfo(2, true, true, true, "meh");
		
		info1.setPlace(place1);
		info2.setPlace(place1);
		info3.setPlace(place1);
		
		
//		ratingInfo.add(info1);
//		place1.setRatingInfo(ratingInfo);
		
		
		//place1.addRatingInfoToList(ratingInfo, info1);
		
		//place1.addRatingInfoToList(info1);
		//place1.setRatingInfo(ratingInfo);
		//List<RatingInfo> garage = new ArrayList<RatingInfo>();
//		garage.add(info1);
		//place1.setRatingInfo(garage, info1);
		//place1.getRatingInfo();
		
		
		 
//		
//		place1.setRatingInfo(garage);
//		
//		place1.getRatingInfo();

		
		
		//System.out.print(ratingInfo1);
//		ratingInfo1.add(info1);
//		ratingInfo1.add(info2);
//		place1.setRatingInfo(ratingInfo1);
		
		
//		place1.setName("Lowes");
//		
//		place1.setRatingInfo(ratingInfoList);
//		ratingInfoList.add(info1);
//		System.out.print(info1);
//		
//		
//		System.out.println(place1);
		
		placeRepo.save(place1);
		placeRepo.save(place2);
		placeRepo.save(place3);
		placeRepo.save(place4);
		placeRepo.save(place5);	
		
		ratingInfoRepo.save(info1);
		ratingInfoRepo.save(info2);
		ratingInfoRepo.save(info3);
		ratingInfoRepo.save(info4);
		ratingInfoRepo.save(info5);
		
		
		
		//System.out.print("Hello World");
		
		
		
		
		
//		placeRepo.save(new Place("McDonalds", "1223 Testing Street"));
//		placeRepo.save(new Place("Wendys", "88113 Oxford Way"));
//		placeRepo.save(new Place("Target", "2332 Fire Way"));
//		
//		ratingInfoRepo.save(new RatingInfo(1, true, true, true, "awesome"));
//		ratingInfoRepo.save(new RatingInfo(3, true, true, false, "meh"));
		
		
		
//		ratingInfoRepo.save(new RatingInfo(""));
		
	}



}
