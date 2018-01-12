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

	@Column(length = 300, nullable = false)
	private String googleId;

	@OneToMany(mappedBy = "place", fetch = FetchType.EAGER)
	private List<RatingInfo> ratingInfo;

	@Column(length = 300, nullable = false)
	private String name;

	@Column(length = 300, nullable = false)
	private String address;

	private double averageRate;

	private double totalRates;

	public Place(String name, String address, String googleId) {
		this.name = name;
		this.address = address;
		this.googleId = googleId;

	}

	public Place() {
	}

	public void calculateTotalRates() {
		int count = ratingInfo.size();
		this.totalRates = count;
	}

	public void calculateAverageRates() {
		double count = getTotalRates();
		double total = 0;

		for (int i = 0; i < ratingInfo.size(); i++) {
			total += ratingInfo.get(i).getRating();
		}

		averageRate = total / count;

	}

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
	}

	public void addRatingInfoToList(List<RatingInfo> ratingInfo, RatingInfo info) {
		ratingInfo.add(info);
		System.out.print(ratingInfo);
	}

	public String getGoogleId() {
		return googleId;
	}

	public void setGoogleId(String googleId) {
		this.googleId = googleId;
	}

	public double getAverageRate() {
		calculateAverageRates();
		return averageRate;
	}

	public void setAverageRate(double averageRate) {
		this.averageRate = averageRate;
	}

	public double getTotalRates() {
		calculateTotalRates();
		return totalRates;
	}

	public void setTotalRates(int totalRates) {
		this.totalRates = totalRates;
	}

}
