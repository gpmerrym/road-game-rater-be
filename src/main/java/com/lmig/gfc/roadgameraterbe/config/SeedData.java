package com.lmig.gfc.roadgameraterbe.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.lmig.gfc.roadgameraterbe.models.User;
import com.lmig.gfc.roadgameraterbe.models.Place;
import com.lmig.gfc.roadgameraterbe.models.RatingInfo;
import com.lmig.gfc.roadgameraterbe.repositories.PlaceRepository;
import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;
import com.lmig.gfc.roadgameraterbe.repositories.UserRepository;

@Configuration
public class SeedData {

	public SeedData(PlaceRepository placeRepo, RatingInfoRepository ratingInfoRepo, UserRepository userRepo,
			PasswordEncoder encoder) {

		Place location1 = new Place("La Hacienda Mexican Restaurant", "12480 North Meridian Street, Carmel",
				"ChIJR3Q3UmasFIgRB_J3Qy4Dd6k");
		Place location2 = new Place("Amber Indian Restaurant", "12510 North Meridian Street, Carmel",
				"ChIJNUjLt2isFIgRqeVfexPb1j0");
		Place location3 = new Place("Moe's Southwest Grill", "12483 North Meridian Street, Carmel",
				"ChIJmeZe92isFIgRJE8b0GH3kWg");
		Place location4 = new Place("J. Razzo′s Italian Restaurant & Wine Bar", "12501 North Meridian Street, Carmel",
				"ChIJW6KN_misFIgRZI--UBzIL-U");
		Place location5 = new Place("Mark Pi's China Gate & Sushi bar", "12297 North Meridian Street, Carmel",
				"ChIJ_eTINWasFIgR5jSu92fnX6c");
		Place location6 = new Place("Max & Erma's", "12195 North Meridian Street, Carmel",
				"ChIJffsY_GasFIgRhTkM3fZtshY");
		Place location7 = new Place("Toppers Pizza", "12545 North Meridian Street, Carmel",
				"ChIJM8PZA2msFIgRoAEShZp4TSI");
		Place location8 = new Place("Le Peep", "12213 North Meridian Street, Carmel ", "ChIJpcw5VGasFIgRVADoXDUFk7Q");
		Place location9 = new Place("Blaze Pizza", "12697 North Pennsylvania Street, Carmel",
				"ChIJqU2w5GmsFIgRD_XdGdbZfUM");
		Place location10 = new Place("Panda Express", "1430 West Carmel Drive, Carmel", "ChIJLQDJ9EKsFIgRZ_oDHJOv4dc");
		Place location11 = new Place("Chipotle Mexican Grill", "12697 North Pennsylvania Street, Carmel",
				"ChIJuWYEdEKsFIgRFE_4zSjTurQ");
		Place location12 = new Place("Zoup!", "1430 West Carmel Drive, Carmel", "ChIJ__8_e0KsFIgRc788EpBbaUU");
		Place location13 = new Place("Meijer Gas Station", "1426 West Carmel Drive, Carmel",
				"ChIJvTHG9EKsFIgRRrKO7_lnpYU");
		Place location14 = new Place("Grille 39", "11925 North Meridian Street, Carmel", "ChIJr-jVQGesFIgRCt2V92tqz8Y");
		Place location15 = new Place("Meijer", "1424 West Carmel Drive, Carmel", "ChIJycaSN0KsFIgRFl_eez-AFcI");
		Place location16 = new Place("Mimi Blue Meatballs", "12505 Old Meridian Street, Carmel",
				"ChIJiQFxp0OsFIgR7gpbbXepBDs");
		Place location17 = new Place("Miracle Sushi & Modern Asian Cuisine", "12505 Old Meridian Street #140, Carmel",
				"ChIJOTYNCEOsFIgRIzIguebDrOM");
		Place location18 = new Place("Renaissance Indianapolis North Hotel", "11925 North Meridian Street, Carmel",
				"ChIJm2NWWWesFIgRQopcq9UhT_E");
		Place location19 = new Place("Brockway Pub", "12525 Old Meridian Street, Carmel",
				"ChIJib9hvUOsFIgRzdcndFFzgsY");
		Place location20 = new Place("Punch Burger", "12525 Old Meridian Street #100, Carmel",
				"ChIJU4A9mEOsFIgR1vSp_ecsdI0");

		RatingInfo rating1 = new RatingInfo(4, false, false, false, "not so bad");
		RatingInfo rating2 = new RatingInfo(4, true, false, true, "good");
		RatingInfo rating3 = new RatingInfo(3, false, true, true, "great");
		RatingInfo rating4 = new RatingInfo(3, true, false, true, "average");
		RatingInfo rating5 = new RatingInfo(4, false, true, true, "bad");
		RatingInfo rating6 = new RatingInfo(4, false, true, true, "soso");
		RatingInfo rating7 = new RatingInfo(5, false, true, true, "gooood");
		RatingInfo rating8 = new RatingInfo(2, false, true, true, "bad");
		RatingInfo rating9 = new RatingInfo(4, true, true, false, "good");
		RatingInfo rating10 = new RatingInfo(3, true, true, false, "good");
		RatingInfo rating11 = new RatingInfo(4, true, false, true, "good");
		RatingInfo rating12 = new RatingInfo(3, true, false, true, "goodie");
		RatingInfo rating13 = new RatingInfo(5, false, true, true, "gooood");
		RatingInfo rating14 = new RatingInfo(2, false, true, true, "bad");
		RatingInfo rating15 = new RatingInfo(4, true, true, false, "good");
		RatingInfo rating16 = new RatingInfo(3, true, true, false, "good");
		RatingInfo rating17 = new RatingInfo(4, true, false, true, "good");
		RatingInfo rating18 = new RatingInfo(5, true, false, true, "good");
		RatingInfo rating19 = new RatingInfo(3, true, true, false, "good");
		RatingInfo rating20 = new RatingInfo(4, true, false, true, "good");
		RatingInfo rating21 = new RatingInfo(3, true, false, true, "good");
		RatingInfo rating22 = new RatingInfo(1, true, false, true, "good");
		RatingInfo rating23 = new RatingInfo(2, true, false, true, "good");
		RatingInfo rating24 = new RatingInfo(3, true, false, true, "good");
		RatingInfo rating25 = new RatingInfo(2, true, false, true, "good");
		RatingInfo rating26 = new RatingInfo(3, true, false, true, "good");
		RatingInfo rating27 = new RatingInfo(4, true, false, true, "good");
		RatingInfo rating28 = new RatingInfo(1, true, false, true, "good");
		RatingInfo rating29 = new RatingInfo(2, true, false, true, "good");
		RatingInfo rating30 = new RatingInfo(5, true, false, true, "good");
		RatingInfo rating31 = new RatingInfo(2, true, false, true, "good");
		RatingInfo rating32 = new RatingInfo(5, true, false, true, "good");
		RatingInfo rating33 = new RatingInfo(3, true, false, true, "good");
		RatingInfo rating34 = new RatingInfo(2, true, false, true, "good");
		RatingInfo rating35 = new RatingInfo(1, true, false, true, "good");
		RatingInfo rating36 = new RatingInfo(5, true, false, true, "good");
		RatingInfo rating37 = new RatingInfo(4, true, false, true, "good");
		RatingInfo rating38 = new RatingInfo(3, true, false, true, "good");
		RatingInfo rating39 = new RatingInfo(5, true, false, true, "good");
		RatingInfo rating40 = new RatingInfo(1, true, false, true, "good");

		rating1.setPlace(location1);
		rating2.setPlace(location1);
		rating3.setPlace(location3);
		rating4.setPlace(location3);
		rating6.setPlace(location2);
		rating7.setPlace(location2);
		rating8.setPlace(location4);
		rating9.setPlace(location4);
		rating10.setPlace(location5);
		rating11.setPlace(location5);
		rating12.setPlace(location6);
		rating5.setPlace(location6);
		rating13.setPlace(location7);
		rating14.setPlace(location7);
		rating15.setPlace(location8);
		rating16.setPlace(location8);
		rating17.setPlace(location9);
		rating18.setPlace(location9);
		rating19.setPlace(location10);
		rating20.setPlace(location10);
		rating21.setPlace(location11);
		rating22.setPlace(location11);
		rating23.setPlace(location12);
		rating24.setPlace(location12);
		rating25.setPlace(location13);
		rating26.setPlace(location13);
		rating27.setPlace(location14);
		rating28.setPlace(location14);
		rating29.setPlace(location15);
		rating30.setPlace(location15);
		rating31.setPlace(location16);
		rating32.setPlace(location16);
		rating33.setPlace(location17);
		rating34.setPlace(location17);
		rating35.setPlace(location18);
		rating36.setPlace(location18);
		rating37.setPlace(location19);
		rating38.setPlace(location19);
		rating39.setPlace(location20);
		rating40.setPlace(location20);

		placeRepo.save(location1);
		placeRepo.save(location2);
		placeRepo.save(location3);
		placeRepo.save(location4);
		placeRepo.save(location5);
		placeRepo.save(location6);
		placeRepo.save(location7);
		placeRepo.save(location8);
		placeRepo.save(location9);
		placeRepo.save(location10);
		placeRepo.save(location11);
		placeRepo.save(location12);
		placeRepo.save(location13);
		placeRepo.save(location14);
		placeRepo.save(location15);
		placeRepo.save(location16);
		placeRepo.save(location17);
		placeRepo.save(location18);
		placeRepo.save(location19);
		placeRepo.save(location20);

		ratingInfoRepo.save(rating1);
		ratingInfoRepo.save(rating2);
		ratingInfoRepo.save(rating3);
		ratingInfoRepo.save(rating4);
		ratingInfoRepo.save(rating5);
		ratingInfoRepo.save(rating6);
		ratingInfoRepo.save(rating7);
		ratingInfoRepo.save(rating8);
		ratingInfoRepo.save(rating9);
		ratingInfoRepo.save(rating10);
		ratingInfoRepo.save(rating11);
		ratingInfoRepo.save(rating12);
		ratingInfoRepo.save(rating13);
		ratingInfoRepo.save(rating14);
		ratingInfoRepo.save(rating15);
		ratingInfoRepo.save(rating16);
		ratingInfoRepo.save(rating17);
		ratingInfoRepo.save(rating18);
		ratingInfoRepo.save(rating19);
		ratingInfoRepo.save(rating20);
		ratingInfoRepo.save(rating21);
		ratingInfoRepo.save(rating22);
		ratingInfoRepo.save(rating23);
		ratingInfoRepo.save(rating24);
		ratingInfoRepo.save(rating25);
		ratingInfoRepo.save(rating26);
		ratingInfoRepo.save(rating27);
		ratingInfoRepo.save(rating28);
		ratingInfoRepo.save(rating29);
		ratingInfoRepo.save(rating30);
		ratingInfoRepo.save(rating31);
		ratingInfoRepo.save(rating32);
		ratingInfoRepo.save(rating33);
		ratingInfoRepo.save(rating34);
		ratingInfoRepo.save(rating35);
		ratingInfoRepo.save(rating36);
		ratingInfoRepo.save(rating37);
		ratingInfoRepo.save(rating38);
		ratingInfoRepo.save(rating39);
		ratingInfoRepo.save(rating40);

		String encodedPassword = encoder.encode("password");
				
		User user = new User();
		
		user.setFirstName("David");
		user.setLastName("Smith");
		user.setPassword(encodedPassword);
		user.setUsername("admin");
		userRepo.save(user);
		
		//user.addRole("ADMIN");
		//admin.addRole("");
		//admin.setUsername("admin");
		//admin.setPassword(encodedPassword);
		//admin.addRole("ADMIN");
		//admin.addRole("ADMIN");
		
		User user2 = new User();
		user2.setFirstName("John");
		user2.setUsername("user");
		user2.setPassword(encodedPassword);
		user2.setLastName("James");
		//user.setUsername("user");
		//user.setPassword(encodedPassword);
		//user.addRole("USER");
		userRepo.save(user2);

	}

}
