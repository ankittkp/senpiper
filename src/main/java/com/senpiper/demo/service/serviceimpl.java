package com.senpiper.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senpiper.demo.Dao.TrainingCentreDao;
import com.senpiper.demo.entities.TrainingCentre;


@Service
public class serviceimpl implements serviceinterface {


	@Autowired
	private TrainingCentreDao tcDao;
	
	
	@Override
	public List<TrainingCentre> getTrainingCentre() {
		// TODO Auto-generated method stub
		
		List<TrainingCentre> listTC = tcDao.findAll();
		return listTC;
	}
	

	@Override
	public String addTrainingCentre(TrainingCentre trainingcentre) {
		// TODO Auto-generated method stub
		String epochTime = String.valueOf(System.currentTimeMillis());
		trainingcentre.setCreatedOn(epochTime);
		tcDao.save(trainingcentre);
		
		return "Data added";
	}


}
