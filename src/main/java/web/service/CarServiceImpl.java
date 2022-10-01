package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    private List<Car> carList;


    @Override
    public List<Car> getListCar(Integer count) {
        carList.add(new Car("Mersedes", "CLS", 2018));
        carList.add(new Car("BMW", "5-series", 2005));
        carList.add(new Car("Mersedes", "S-Class", 2010));
        carList.add(new Car("Audi", "A5", 2009));
        carList.add(new Car("BMW", "7-series", 2015));
        if (count > carList.size() || count <= 0) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
