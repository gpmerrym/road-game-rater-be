package com.lmig.gfc.roadgameraterbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.gfc.roadgameraterbe.models.RatingInfo;

@Repository
public interface RatingInfoRepository extends JpaRepository<RatingInfo, Long> {

}