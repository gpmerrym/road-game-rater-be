package com.lmig.gfc.roadgameraterbe.config;



import java.util.ArrayList;
import java.util.List;

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

		RatingInfo rating1 = new RatingInfo(4, true, true, false, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F09_23.jpg?alt=media&token=ebf607db-32ab-4498-bcbb-aa1de86a6471");
		RatingInfo rating2 = new RatingInfo(4, true, true, true, "I must say, this place was really great. I wish I would have found it sooner and so do my pants.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F1372874545000-XXX-d-dirty-133--1307031653_4_3.JPG?alt=media&token=c3502a50-2e04-4255-86d0-db996f896a4a");
		RatingInfo rating3 = new RatingInfo(3, false, true, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F186715538.jpg?alt=media&token=f650b92e-09ac-4a5b-b22a-96e2438a88b3");
		RatingInfo rating4 = new RatingInfo(3, false, false, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F200321092-001.jpeg?alt=media&token=d2a04764-820b-4f5b-abdc-7e232e1ead3f");
		RatingInfo rating5 = new RatingInfo(4, true, true, true, "I must say, this place was really great. I wish I would have found it sooner and so do my pants.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F200321092-001.jpeg?alt=media&token=d2a04764-820b-4f5b-abdc-7e232e1ead3f");
		RatingInfo rating6 = new RatingInfo(4, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F491801268.jpg?alt=media&token=32c427f9-276a-4a09-af20-c20aa001065d");
		RatingInfo rating7 = new RatingInfo(5, true, true, true, "I must say, this place was really great. I wish I would have found it sooner and so do my pants.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F514475316.jpg?alt=media&token=a9408213-ec3e-4015-a407-1ced081122e2");
		RatingInfo rating8 = new RatingInfo(2, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F514475316.jpg?alt=media&token=a9408213-ec3e-4015-a407-1ced081122e2");
		RatingInfo rating9 = new RatingInfo(4, true, true, false, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2F98187040275.jpg?alt=media&token=41e0ab44-ce00-469d-b4f4-38cebfb2a4d8");
		RatingInfo rating10 = new RatingInfo(3, true, true, false, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Far127049281157304.jpg?alt=media&token=9d2a26fd-fb92-4559-80a6-bd90c1b65ebf");
		RatingInfo rating11 = new RatingInfo(1, false, false, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fbathrooms-900x600.jpg?alt=media&token=b0b6d63a-370b-4823-96f4-37736c2291ca");
		RatingInfo rating12 = new RatingInfo(3, true, true, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdirty_bathroom_by_mediamerc-d4nbcvh.jpg?alt=media&token=b3ca0f05-1bfb-4d55-98f4-768c7ac18374");
		RatingInfo rating13 = new RatingInfo(1, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdirtyrestroomsink.JPG?alt=media&token=a720f8f4-8b5e-462f-85a2-3655701e48ae");
		RatingInfo rating14 = new RatingInfo(5, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdownload%20(1).jpg?alt=media&token=fa6496c2-f4ef-457c-9596-7399e4c0fc14");
		RatingInfo rating15 = new RatingInfo(4, true, true, false, "I must say, this place was really great. I wish I would have found it sooner and so do my pants.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdownload%20(1).jpg?alt=media&token=fa6496c2-f4ef-457c-9596-7399e4c0fc14");
		RatingInfo rating16 = new RatingInfo(3, true, true, false, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdownload%20(3).jpg?alt=media&token=b05d8a25-a92a-4189-9bed-467c33d95182");
		RatingInfo rating17 = new RatingInfo(4, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdownload%20(4).jpg?alt=media&token=9f67a700-aa6b-416d-9788-abcc90af45e1");
		RatingInfo rating18 = new RatingInfo(5, true, false, true, "I must say, this place was really great. I wish I would have found it sooner and so do my pants.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdownload%20(5).jpg?alt=media&token=4d374359-6171-48e9-82e6-20a27baad426");
		RatingInfo rating19 = new RatingInfo(3, true, true, false, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fdownload.jpg?alt=media&token=7769bb40-29d4-4df0-91e4-bda014a82dc7");
		RatingInfo rating20 = new RatingInfo(4, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fduncanville.jpg?alt=media&token=ab60a1c4-228f-45dd-bedd-aa12d067c2b5");
		RatingInfo rating21 = new RatingInfo(3, true, true, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fe5c13572beb637f6dd2b4ddce5519490--kid-bathrooms-bathroom-sinks.jpg?alt=media&token=35d0df3e-3868-4177-9233-2861d9434fde");
		RatingInfo rating22 = new RatingInfo(1, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2FGreenLake_06-683x1024.jpg?alt=media&token=084d5593-fe8d-441c-a435-a4825262901f");
		RatingInfo rating23 = new RatingInfo(1, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fgross-public-bathroomsgross-public-bathroomtop-secret-cvs-bathroom-bad-mommy-moments-e1mgvvxr-798x418.jpg?alt=media&token=a486f5f5-50da-4311-84ad-91ed7833c74e");
		RatingInfo rating24 = new RatingInfo(5, true, true, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages%20(1).jpg?alt=media&token=a10d6b68-76e3-4694-9015-f2421bbfb1ab");
		RatingInfo rating25 = new RatingInfo(2, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages%20(2).jpg?alt=media&token=0818d151-1271-4d5d-9270-3570481990df");
		RatingInfo rating26 = new RatingInfo(3, false, true, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages%20(3).jpg?alt=media&token=0a98ceb8-011b-4149-9ac8-5532fcdea5cd");
		RatingInfo rating27 = new RatingInfo(4, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages%20(4).jpg?alt=media&token=1c16e802-4c08-4ace-a307-c01a3e922e4b");
		RatingInfo rating28 = new RatingInfo(1, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages%20(5).jpg?alt=media&token=712c330f-fc93-4f97-a7f3-f904f528fa78");		
		RatingInfo rating29 = new RatingInfo(2, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages%20(6).jpg?alt=media&token=9e8d24e8-31df-4359-9a39-5fe93f8af633");
		RatingInfo rating30 = new RatingInfo(5, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimages.jpg?alt=media&token=7cf0d384-859e-4679-acd6-720cc40fe99a");
		RatingInfo rating31 = new RatingInfo(2, false, true, true, "Talk about a dump, could not even go there.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fimg_35022.jpg?alt=media&token=26218db2-71d0-4fea-83bc-d95a647b3b58");
		RatingInfo rating32 = new RatingInfo(5, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2FiStock_000037654540_Small1-1-566x380.jpg?alt=media&token=10aa815e-3c1d-4a5e-9de9-bc17cec91531");
		RatingInfo rating33 = new RatingInfo(3, true, true, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fits-totally-okay-to-sit-on-public-toilet-seats-1485895504.jpg?alt=media&token=9154fa32-f816-475d-aeef-c62cb7ee8c43");
		RatingInfo rating34 = new RatingInfo(2, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fjapanese-toilet.jpg?alt=media&token=9fb0dc37-11aa-409f-b73b-adb2a4df548f");
		RatingInfo rating35 = new RatingInfo(1, false, true, true, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2FLa%20Hacienda%20Mexican%20Restaurant.jpg?alt=media&token=a5254c71-a143-48ee-9560-ae6b5507b01e");
		RatingInfo rating36 = new RatingInfo(1, false, true, true, "Talk about a dump, could not even go there.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fla-hacienda-mexican-restaurant.jpg?alt=media&token=1c066af9-949e-4b33-87c9-76bc0a810351");
		RatingInfo rating37 = new RatingInfo(4, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fnprbathroom_wide-b891ec9cceb999888de29d0b110dfe57e6180369-s900-c85.jpg?alt=media&token=b2680d6f-8f5b-4d99-b897-15512f27cbc8");
		RatingInfo rating38 = new RatingInfo(3, true, false, true, "All was clean and was able to do what I need to. Would recommend this place to anyone needing to go when on the go.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fo.jpg?alt=media&token=5a22fa2c-ab75-4a37-b438-fc1a4d4e6df2");
		RatingInfo rating39 = new RatingInfo(5, true, true, true, "What an amazing place to visit and the bathrooms were top notch! I’m not scared to go there and toilet paper was very soft, not that cheap kind.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fp8.jpg?alt=media&token=774faa7a-5653-422a-8aaa-60705f57ece9");
		RatingInfo rating40 = new RatingInfo(1, false, true, false, "Wow, stay clear of this place. Had to go so bad but this place made me wait for someplace else close by.", "https://firebasestorage.googleapis.com/v0/b/favoritethings-6668b.appspot.com/o/uploads%2Fv4oblcTE.jpg?alt=media&token=f1dccbe5-f510-45a7-bb8b-75572b4a6b82");

		
		String encodedPassword = encoder.encode("password");
		
		User user = new User();
		
		user.setFirstName("David");
		user.setLastName("Smith");
		user.setPassword(encodedPassword);
		user.setUsername("admin");
		userRepo.save(user);
		
		User user2 = new User();
		user2.setFirstName("John");
		user2.setUsername("user");
		user2.setPassword(encodedPassword);
		user2.setLastName("James");
		userRepo.save(user2);

		rating1.setPlace(location1);
		rating2.setPlace(location1);
		rating3.setPlace(location2);
		rating4.setPlace(location2);
		rating5.setPlace(location3);
		rating6.setPlace(location3);
		rating7.setPlace(location4);
		rating8.setPlace(location4);
		rating9.setPlace(location5);
		rating10.setPlace(location5);
		rating11.setPlace(location6);
		rating12.setPlace(location6);
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
		
		
		rating1.setUser(user);
		rating2.setUser(user2);
		rating3.setUser(user);
		rating4.setUser(user2);
		rating5.setUser(user);
		rating6.setUser(user2);
		rating7.setUser(user);
		rating8.setUser(user2);
		rating9.setUser(user);
		rating10.setUser(user2);
		rating11.setUser(user);
		rating12.setUser(user2);
		rating13.setUser(user);
		rating14.setUser(user2);
		rating15.setUser(user);
		rating16.setUser(user2);
		rating17.setUser(user);
		rating18.setUser(user2);
		rating19.setUser(user);
		rating20.setUser(user2);
		rating21.setUser(user);
		rating22.setUser(user2);
		rating23.setUser(user);
		rating24.setUser(user2);
		rating25.setUser(user);
		rating26.setUser(user2);
		rating27.setUser(user);
		rating28.setUser(user2);
		rating29.setUser(user);
		rating30.setUser(user2);
		rating31.setUser(user);
		rating32.setUser(user2);
		rating33.setUser(user);
		rating34.setUser(user2);
		rating35.setUser(user);
		rating36.setUser(user2);
		rating37.setUser(user);
		rating38.setUser(user2);
		rating39.setUser(user);
		rating40.setUser(user2);
		
		
		
		List<User> users = new ArrayList<User>();
		users.add(user);
		users.add(user2);
		
		location1.setUser(users);
		location2.setUser(users);
		location3.setUser(users);
		location4.setUser(users);
		location5.setUser(users);
		location6.setUser(users);
		location7.setUser(users);
		location8.setUser(users);
		location9.setUser(users);
		location10.setUser(users);
		location11.setUser(users);
		location12.setUser(users);
		location13.setUser(users);
		location14.setUser(users);
		location15.setUser(users);
		location16.setUser(users);
		location17.setUser(users);
		location18.setUser(users);
		location19.setUser(users);
		location20.setUser(users);
		
		
		
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
		
		
		
		

		
	}

}
