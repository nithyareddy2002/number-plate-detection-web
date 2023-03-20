package com.mvsr.cse.numberplatedetection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvsr.cse.numberplatedetection.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Short>{

}
