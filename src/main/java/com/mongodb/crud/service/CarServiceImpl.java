package com.mongodb.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mongodb.crud.model.Car;
import com.mongodb.crud.repositories.CarMongoRepository;
import com.mongodb.crud.repositories.CarRepositoryImpl;

@Service
public class CarServiceImpl implements CarService{

	/*@Autowired
	CarMongoRepository carRepo;*/
	
	@Autowired
	private CarRepositoryImpl carRepositoryImpl;
	
	@Override
	public List<Car> getAllCars() {
		return (List<Car>) carRepositoryImpl.getAllCars();
	}

	@Override
	public void addCar(Car car) {
		carRepositoryImpl.create(car);		
	}

}
