package com.mvsr.cse.numberplatedetection.service;

import java.util.List;
import java.util.Optional;

import com.mvsr.cse.numberplatedetection.model.Location;
import com.mvsr.cse.numberplatedetection.model.NumberPlate;

public interface NumberPlateDetectionService {

	public List<Location> getAllLocations();

	public List<NumberPlate> getAllRecords();

	public Optional<NumberPlate> getNumberPlateById(Long id);

	public List<NumberPlate> getNumberPlateByPlate(String numberPlate);

}
