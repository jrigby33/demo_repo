package com.jtr.services;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jtr.data.JobsRepository;
import com.jtr.domain.Job;

@Service(value = "jobService")
public class JobService {
	
	@Autowired
	private JobsRepository jobRepository;
	

	
	public List<Job> retrieveJobs(){
		System.out.println("retrieving jobs");
		List<Job> jobsList = jobRepository.findAll();

		for(Job job : jobsList) {
			switch(job.getCategory())
	        {
	            case "1":
	            	job.setCategory("Construction");
	                continue;
	            case "2":
	            	job.setCategory("Plumbing");
	                continue;
	            case "3":
	            	job.setCategory("Electric");
	                continue;
	            case "4":
	            	job.setCategory("Landscaping");
	                continue;
	            default:
	                System.out.println("N/A");
	        }		
			job.setUserId(2);
		}
		
		
		return jobsList;
	}
	
	public Job createJob(Job job){
		
		if (StringUtils.isEmpty(job.getJobId())) {
			UUID uniqueKey = UUID.randomUUID();
			job.setJobId(uniqueKey.toString());
		}
		job.setPostedDate(new Date());
		System.out.println("Creating job: " + job.getJobId());
		return jobRepository.insert(job);
	}

}
