package com.lmig.gfc.roadgameraterbe.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;

@Configuration
public class SeedData {

	public SeedData(PlaceRepository placeRepo, RatingInfoRepository ratingInfoRepo) {

		RatingInfo info1 = new RatingInfo(1, false, false, false, "sucks");
		RatingInfo info2 = new RatingInfo(3, true, false, true, "average");
		RatingInfo info3 = new RatingInfo(4, false, true, true, "good");
		RatingInfo info4 = new RatingInfo(5, true, true, true, "great");
		RatingInfo info5 = new RatingInfo(2, true, true, true, "no impressed");
		RatingInfo info6 = new RatingInfo(1, true, true, true, "awful");
		RatingInfo info7 = new RatingInfo(3, true, true, true, "solid");
		RatingInfo info8 = new RatingInfo(4, false, true, true, "enjoyable");
		RatingInfo info9 = new RatingInfo(4, true, false, true, "pretty good");
		RatingInfo info10 = new RatingInfo(5, true, true, false, "Great");

		Place place1 = new Place("McDonalds", "1223 Pepsi Avenue", "qlasdfjlkajdf");
		Place place2 = new Place("Target", "1223 Water Street", "23fadfasdflkj");
		Place place3 = new Place("Wendys", "44333 Wall Ave", "34sdfsdflkj");
		Place place4 = new Place("Wallgreens", "55433 Dog Ave", "345fsdfs");
		Place place5 = new Place("Subway", "453 Gatorade Street", "345sdfasdfad");

		info1.setPlace(place1);
		info2.setPlace(place1);
		info3.setPlace(place1);
		info4.setPlace(place2);
		info5.setPlace(place2);
		info6.setPlace(place2);
		info7.setPlace(place2);
		info8.setPlace(place3);
		info9.setPlace(place4);
		info10.setPlace(place5);

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
		ratingInfoRepo.save(info6);
		ratingInfoRepo.save(info7);
		ratingInfoRepo.save(info8);
		ratingInfoRepo.save(info9);
		ratingInfoRepo.save(info10);

	}

}
