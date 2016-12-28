package com.mongodb.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.crud.model.Car;
import com.mongodb.crud.service.CarServiceImpl;

@Controller
public class CarController {

	@Autowired
	private CarServiceImpl carService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model){
		model.addAttribute("carList", carService.getAllCars());
		return "home";
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute Car car){
		carService.addCar(car);
		return "redirect:home";
	}
	
	@RequestMapping(value ="/search", method = RequestMethod.POST)
	public String search(Model model, @RequestParam String search){
		model.addAttribute("carList", carService.searchCar(search));
		model.addAttribute("search", search);
		return "home";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteCar(@PathVariable("id") String id){
		carService.deleteCarById(id);
		return "redirect:/home";
	}
}
