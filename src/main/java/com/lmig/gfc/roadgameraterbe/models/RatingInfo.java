package com.lmig.gfc.roadgameraterbe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class RatingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JsonIgnore
	private Place place;
	
	@ManyToOne
	@JsonIgnore
	private User user;

	@Column(nullable = false)
	private int rating;

	@Column(nullable = false)
	private Boolean isClean;

	@Column(nullable = false)
	private Boolean isHandicap;

	@Column
	private Boolean isFamily;

	@Column(length = 5000)
	private String comments;
	
	@Column
	private String itemImageUrl;
	
	public RatingInfo(int rating, Boolean isClean, Boolean isHandicap, Boolean isFamily, String comments, String itemImageUrl) {
		super();

		this.rating = rating;
		this.isClean = isClean;
		this.isHandicap = isHandicap;
		this.isFamily = isFamily;
		this.comments = comments;
		this.itemImageUrl = itemImageUrl;
	}

	public RatingInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Boolean getIsClean() {
		return isClean;
	}

	public void setIsClean(Boolean isClean) {
		this.isClean = isClean;
	}

	public Boolean getIsHandicap() {
		return isHandicap;
	}

	public void setIsHandicap(Boolean isHandicap) {
		this.isHandicap = isHandicap;
	}

	public Boolean getIsFamily() {
		return isFamily;
	}

	public void setIsFamily(Boolean isFamily) {
		this.isFamily = isFamily;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getItemImageUrl() {
		return itemImageUrl;
	}

	public void setItemImageUrl(String itemImageUrl) {
		this.itemImageUrl = itemImageUrl;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



}
