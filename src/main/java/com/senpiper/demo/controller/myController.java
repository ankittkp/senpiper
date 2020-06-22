package com.senpiper.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senpiper.demo.entities.TrainingCentre;
import com.senpiper.demo.service.serviceinterface;


@RestController
public class myController {

	@Autowired
	private serviceinterface srvcinterface; 
	
	
	@GetMapping("/home")
	public String home() {
		return "It's working";
	}
	
	@GetMapping("/gettc")
	public List<TrainingCentre> getTrainingCentre(){
		return this.srvcinterface.getTrainingCentre();
	}
	
	
	@PostMapping("/add")
	public String addTrainingCentre(
			@RequestBody TrainingCentre trainingcentre) {
				return this.srvcinterface.addTrainingCentre(trainingcentre);
		
		
	}
}
