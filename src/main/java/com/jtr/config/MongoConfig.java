package com.jtr.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

@Configuration
@EnableMongoRepositories({"com.jtr.data","com.jtr.domain"})
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	@Bean	
	public MongoClient mongoClient() {
		//MongoClient client = new MongoClient("localhost:27017");
		/**
		MongoCredential mongoCred = MongoCredential.createScramSha1Credential("demo_user", "jobs_db", "heyhey33".toCharArray());
		List<ServerAddress> serverAddress  = new ArrayList<>();
		serverAddress.add(new ServerAddress("cluster0-wzzow.mongodb.net",27017));
		
		List<MongoCredential> mongoCredList = new ArrayList<>();
		mongoCredList.add(mongoCred);
		
		MongoClientOptions mongoClientOptions = new MongoClientOptions.Builder().sslEnabled(true).build();
		MongoClient client = new MongoClient(serverAddress, mongoCredList, mongoClientOptions);
		**/
		/** **/
		MongoClientURI uri = new MongoClientURI(
			    "mongodb+srv://demo_user:heyhey33@cluster0-wzzow.mongodb.net/");

			MongoClient mongoClient = new MongoClient(uri);
			//MongoDatabase database = mongoClient.getDatabase("jobs_db");
		return mongoClient;
	}
	
	@Override
	protected String getDatabaseName() {
		return "jobs_db";
	}
	
}
