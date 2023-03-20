package com.mvsr.cse.numberplatedetection.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.mvsr.cse.numberplatedetection.model.NumberPlate;
import com.mvsr.cse.numberplatedetection.repository.NumberPlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvsr.cse.numberplatedetection.model.Location;
import com.mvsr.cse.numberplatedetection.repository.LocationRepository;

@Transactional
@Service
public class NumberPlateDetectionServiceImpl implements NumberPlateDetectionService {
	
	@Autowired
	LocationRepository locationRepository;

	@Autowired
	NumberPlateRepository numberPlateRepository;

	@Override
	public List<Location> getAllLocations() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Override
	public List<NumberPlate> getAllRecords() {
		return numberPlateRepository.findAll();
	}

	@Override
	public Optional<NumberPlate> getNumberPlateById(Long id) {
		return numberPlateRepository.findById(id);
	}

	@Override
	public List<NumberPlate> getNumberPlateByPlate(String numberPlate){
		return  numberPlateRepository.findByNumberPlate(numberPlate);
	}

}
