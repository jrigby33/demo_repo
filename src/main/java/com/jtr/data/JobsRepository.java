package com.jtr.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jtr.domain.Job;

@Repository
public interface JobsRepository extends MongoRepository<Job, String> {

	
}
