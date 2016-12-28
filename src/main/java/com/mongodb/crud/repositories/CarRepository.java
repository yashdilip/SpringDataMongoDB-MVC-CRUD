package com.mongodb.crud.repositories;

import java.util.List;

import com.mongodb.crud.model.Car;

public interface CarRepository {

	public void create(Car car);
	public List<Car> getAllCars();
	public Car getCarByModel(String model);
	public List<Car> searchCar(String search);
	public void deleteById(String id);
}
