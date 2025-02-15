package com.training.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.center.model.Address;
import com.training.center.model.TrainingCenter;
import com.training.center.repository.TrainingCenterRepository;
import com.training.center.request.TrainingCenterCreateRequest;

@Service
public class TrainingCenterService {

	@Autowired
	private TrainingCenterRepository trainingCenterRepository;
	
	/**
	 * This method creates and returns the training center object
	 * 
	 * @param createRequest
	 * @return
	 */

	public TrainingCenter createTrainingCenter(TrainingCenterCreateRequest createRequest) {
		TrainingCenter trainingCenter = new TrainingCenter();
		trainingCenter.setCenterName(createRequest.getCenterName());
		trainingCenter.setCenterCode(createRequest.getCenterCode());
		trainingCenter.setEmail(createRequest.getEmail());
		trainingCenter.setPhone(createRequest.getPhone());
		trainingCenter.setStudentCapacity(createRequest.getStudentCapacity());
		trainingCenter.setCourses(createRequest.getCourses());
		Address address = new Address();
		address.setDetailedAddress(createRequest.getAddress().getDetailedAddress());
		address.setCity(createRequest.getAddress().getCity());
		address.setState(createRequest.getAddress().getState());
		address.setPincode(createRequest.getAddress().getPincode());
		trainingCenter.setAddress(address);
		trainingCenterRepository.save(trainingCenter);
		System.out.println("Created Successfully");
		return trainingCenter;
	}
	
	/**
	 * This method is used to get the list of training centers
	 * 
	 * @return
	 */

	public List<TrainingCenter> trainingCenterList() {
		return trainingCenterRepository.findAll();
	}

}
