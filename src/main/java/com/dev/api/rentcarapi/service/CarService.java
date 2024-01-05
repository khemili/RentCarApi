package com.dev.api.rentcarapi.service;

import com.dev.api.rentcarapi.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getAllCar() {
        Car car = new Car();
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car);
        return cars;
    }
}
