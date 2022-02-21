package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService{

    public CarService(){
    }

    public List<Car> listCars(int count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2000, "Tesla", 1231));
        cars.add(new Car(1988, "Ferrari", 42124));
        cars.add(new Car(1999, "Ford", 9829));
        cars.add(new Car(2012, "BMW", 2334));
        cars.add(new Car(2008, "VolksWagen", 52));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
