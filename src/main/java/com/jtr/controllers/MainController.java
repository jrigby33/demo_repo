package com.jtr.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import com.jtr.domain.House;
import com.jtr.domain.Job;
import com.jtr.services.JobService;

@RestController
public class MainController {
	
	@Autowired
	private JobService jobsService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/test")
	public List<House> test() {
		
		House house1 = new House(1, "3 Dupuis Cir", "USA", "Sick ass place", 9000000, 277667);
		House house2 = new House(2, "62 Wiley Lane", "USA", "Place sucks", 1500, 462358);
		House house3 = new House(3, "10 Licky lick way", "USSR", "Pretty dope pad", 100000, 259600);
		House house4 = new House(4, "18 Big Stix, Cir", "CA", "Not sure you want to go here", 500000, 534182);
		House house5 = new House(5, "10 Africa America St", "USA", "Heads up ya hear?", 9000000, 164558);
		List<House> houses = new ArrayList<House>();
		houses.add(house1);
		houses.add(house2);
		houses.add(house3);
		houses.add(house4);
		houses.add(house5);		
		return houses;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/jobs")
	public List<Job> getJobs() {
		return jobsService.retrieveJobs();
		
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/postJob", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Job postJob(@RequestBody Job job) {
		return jobsService.createJob(job);
		
	}

}
