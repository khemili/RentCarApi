package com.dev.api.rentcarapi.web.controller;

import com.dev.api.rentcarapi.model.Car;
import com.dev.api.rentcarapi.service.CarService;
import com.dev.api.rentcarapi.web.CarEndpoints;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/cars")
public class CarController implements CarEndpoints {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    //Récupérer toutes les voitures GET
    @GetMapping
    public List<Car> getAllCar() {
        return carService.getAllCar();
    }

}
