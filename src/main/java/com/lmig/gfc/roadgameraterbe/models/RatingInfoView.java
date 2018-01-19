package com.lmig.gfc.roadgameraterbe.models;

public class RatingInfoView {

	private RatingInfo ratingInfo;

	public RatingInfo getRatinginfo() {
		return ratingInfo;
	}

	public Long getId() {
		return ratingInfo.getId();
	}

	public int getRating() {
		return ratingInfo.getRating();
	}

	public Boolean getIsClean() {
		return ratingInfo.getIsClean();
	}

	public Boolean getIsHandicap() {
		return ratingInfo.getIsHandicap();
	}

	public Boolean getIsFamily() {
		return ratingInfo.getIsFamily();
	}

	public String getComments() {
		return ratingInfo.getComments();
	}

	public Place getPlace() {
		return ratingInfo.getPlace();
	}

	public String getItemImageUrl() {
		return ratingInfo.getItemImageUrl();
	}

	public User getUser() {
		return ratingInfo.getUser();
	}

}
