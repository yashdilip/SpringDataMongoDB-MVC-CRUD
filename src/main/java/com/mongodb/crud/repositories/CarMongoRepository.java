package com.mongodb.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.crud.model.Car;

public interface CarMongoRepository extends MongoRepository<Car, String>{

}
