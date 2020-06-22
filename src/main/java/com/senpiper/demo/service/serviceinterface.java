package com.senpiper.demo.service;

import java.util.List;

import com.senpiper.demo.entities.TrainingCentre;

public interface serviceinterface {
	public List<TrainingCentre>getTrainingCentre();
	public String addTrainingCentre(TrainingCentre trainingcentre);
}
