package com.lmig.gfc.roadgameraterbe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RatingInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private int rating;

	@Column(nullable = false)
	private Boolean isClean;

	@Column(nullable = false)
	private Boolean isHandicap;

	@Column
	private Boolean isFamily;

	@Column(length = 300, nullable = false)
	private String comments;

	public RatingInfo(int rating, Boolean isClean, Boolean isHandicap, Boolean isFamily, String comments) {
		super();
		
		this.rating = rating;
		this.isClean = isClean;
		this.isHandicap = isHandicap;
		this.isFamily = isFamily;
		this.comments = comments;
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
	};

}