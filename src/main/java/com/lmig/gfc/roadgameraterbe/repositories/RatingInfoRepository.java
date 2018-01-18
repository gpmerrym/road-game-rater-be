package com.lmig.gfc.roadgameraterbe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.roadgameraterbe.models.RatingInfo;

@Repository
public interface RatingInfoRepository extends JpaRepository<RatingInfo, Long> {

	List<RatingInfo> findByPlaceId(Long placeId);
	List<RatingInfo> findByPlaceIdAndUserId(Long userId, Long placeId);
	List<RatingInfo> findByUserId(Long userId);

}