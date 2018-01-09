package com.lmig.gfc.roadgameraterbe.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(mappedBy = "place", fetch = FetchType.EAGER)
	private List<RatingInfo> ratingInfo;
	
	@Column(length = 300, nullable = false)
	private String name;
	
	@Column(length = 300, nullable = false)
	private String address;
	
	public Place(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Place() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<RatingInfo> getRatingInfo() {
		return ratingInfo;
	}

	public void setRatingInfo(List<RatingInfo> ratingInfo) {
		this.ratingInfo = ratingInfo;
	};
	
}
