package com.mongodb.crud.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongodb.crud.model.Car;

@Repository
public class CarRepositoryImpl implements CarRepository {

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

	@Override
	public Car getCarByModel(String model) {
		// TODO Auto-generated method stub
		return mongoTemplate.findOne(new Query(Criteria.where("model").is(model)), Car.class);
	}

	@Override
	public List<Car> searchCar(String search) {
		return mongoTemplate.find(
				Query.query(new Criteria().orOperator(Criteria.where("description").regex(search, "i"),
						Criteria.where("make").regex(search, "i"),
						Criteria.where("model").regex(search, "i"),
						Criteria.where("year").regex(search, "i"))), Car.class);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), Car.class);
		
	}

}
