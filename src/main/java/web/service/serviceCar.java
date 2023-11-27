package web.service;

import web.model.Car;

import java.util.List;

public interface serviceCar {
    List<Car> getCars(Integer count);
}
