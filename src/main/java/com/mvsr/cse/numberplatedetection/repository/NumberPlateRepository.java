package com.mvsr.cse.numberplatedetection.repository;

import com.mvsr.cse.numberplatedetection.model.NumberPlate;
import com.mvsr.cse.numberplatedetection.util.Queries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface NumberPlateRepository extends JpaRepository<NumberPlate, Long> {

    public List<NumberPlate> findByNumberPlate(String numberPlate);

}
