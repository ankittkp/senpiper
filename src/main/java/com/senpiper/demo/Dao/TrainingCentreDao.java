package com.senpiper.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senpiper.demo.entities.TrainingCentre;

@Repository
public interface TrainingCentreDao extends JpaRepository<TrainingCentre, String>{
	
	
} 