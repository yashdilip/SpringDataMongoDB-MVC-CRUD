package com.mongodb.crud.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.crud.model.Car;

@Repository
public class CarRepositoryImpl implements CarRepository{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public void create(Car car) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(car);
		
	}

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Car.class);
	}

	
}
