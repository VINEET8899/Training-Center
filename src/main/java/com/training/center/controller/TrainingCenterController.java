package com.training.center.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.center.model.TrainingCenter;
import com.training.center.request.TrainingCenterCreateRequest;
import com.training.center.service.TrainingCenterService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class TrainingCenterController {

	private static final Logger logger = LoggerFactory.getLogger(TrainingCenterController.class);

	@Autowired
	private TrainingCenterService service;

	/**
	 * This API is used to create training center
	 * 
	 * @param response
	 * @param createRequest
	 * @return
	 * @throws IOException
	 */

	@PostMapping("training/center/create")
	public TrainingCenter createTrainingCenter(HttpServletResponse response,
			@Valid @RequestBody TrainingCenterCreateRequest createRequest) throws IOException {
		try {
			return service.createTrainingCenter(createRequest);
		} catch (Exception e) {
			logger.error("Error creating training center: {}", e.getMessage());
			response.sendError(HttpStatus.BAD_REQUEST.value());
		}
		return null;
	}

	/**
	 * This API is used to get the list of training centers
	 * 
	 * @param response
	 * @return
	 * @throws IOException
	 */

	@GetMapping("get/training/center/list")
	public List<TrainingCenter> trainingCenterList(HttpServletResponse response) throws IOException {
		try {
			return service.trainingCenterList();
		} catch (Exception e) {
			logger.error("Error fetching training center list: {}", e.getMessage());
			response.sendError(HttpStatus.BAD_REQUEST.value());
		}
		return null;
	}

}
