package com.mongodb.crud.service;

import java.util.List;

import com.mongodb.crud.model.Car;

public interface CarService {
	public List<Car> getAllCars();
	public void addCar(Car car);
	public List<Car> searchCar(String search);
	public void deleteCarById(String id);
}
