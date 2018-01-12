package com.lmig.gfc.roadgameraterbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lmig.gfc.roadgameraterbe.models.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

	Place findByGoogleId(String googleId);

}
