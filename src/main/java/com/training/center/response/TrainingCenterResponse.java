package com.training.center.response;

import com.training.center.model.TrainingCenter;

public class TrainingCenterResponse {

	private TrainingCenter center;
	private String error;

	public TrainingCenter getCenter() {
		return center;
	}

	public void setCenter(TrainingCenter center) {
		this.center = center;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
