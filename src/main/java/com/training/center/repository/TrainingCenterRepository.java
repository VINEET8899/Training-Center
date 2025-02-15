package com.training.center.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.training.center.model.TrainingCenter;

@Repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {

}
