package com.lmig.gfc.roadgameraterbe.models;

import java.util.List;

import com.lmig.gfc.roadgameraterbe.repositories.RatingInfoRepository;

public class PlaceView {

	private Place place;
	private RatingInfoRepository ratingRepo;
	private Long userId;

	public PlaceView(Place place, Long userId) {
		this.place = place;
		this.userId = userId;
	}

	public PlaceView() {

	}

	public Long getId() {
		return place.getId();
	}

	public String getName() {
		return place.getName();
	}

	public String getAddress() {
		return place.getAddress();
	}

	public RatingInfoView getRatingInfo() {
		RatingInfo ratingInfo = (RatingInfo) ratingRepo.findByPlaceIdAndUserId(userId, place.getId());
		RatingInfoView ratingView = new RatingInfoView(ratingInfo);
		return ratingView;
		

	}

	public String getGoogleId() {
		return place.getGoogleId();
	}

	public double getAverageRate() {
		// place.calculateAverageRates();;
		return place.getAverageRate();
	}

	public double getTotalRates() {
		return place.getTotalRates();
	}

	// public Long getUser() {
	// return place.getUser();
	// }

}
