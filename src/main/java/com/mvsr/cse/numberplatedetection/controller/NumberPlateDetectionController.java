package com.mvsr.cse.numberplatedetection.controller;

import java.util.List;
import java.util.Optional;

import com.mvsr.cse.numberplatedetection.model.NumberPlate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mvsr.cse.numberplatedetection.model.Location;
import com.mvsr.cse.numberplatedetection.service.NumberPlateDetectionService;

@RestController
public class NumberPlateDetectionController {

	@Autowired
	NumberPlateDetectionService numberPlateDetectionService;
	
	@GetMapping("/locations")
	public List<Location> getAllLocations(){
		return numberPlateDetectionService.getAllLocations();
	}

	@GetMapping("/records")
	public List<NumberPlate> getAllRecords(){
		return numberPlateDetectionService.getAllRecords();
	}

	@GetMapping("/numberplate/{id}")
	public NumberPlate getNumberPlateById(@PathVariable(value="id") Long id){
		Optional<NumberPlate> numberPlate = numberPlateDetectionService.getNumberPlateById(id);
		if(numberPlate.isPresent()){
			return numberPlate.get();
		}
		return null;
	}
//
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/number-plate-by-plate/{number-plate}")
	public List<NumberPlate> getNumberPlateByPlate(@PathVariable(value="number-plate") String numberPlate){
		List<NumberPlate> numberPlates = numberPlateDetectionService.getNumberPlateByPlate(numberPlate);
		return numberPlates;
	}

}
