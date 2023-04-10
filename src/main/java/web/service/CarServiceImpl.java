package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {


    @Override
    public List<Car> createCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("1_model", 1000, "white"));
        carList.add(new Car("2_model", 2000, "red"));
        carList.add(new Car("3_model", 3000, "dark"));
        carList.add(new Car("4_model", 4000, "gray"));
        carList.add(new Car("5_model", 5000, "blue"));
        return carList;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        List<Car> resultList = new ArrayList<>(createCarList());
        return count != null ? resultList.subList(0, count) : resultList;
    }
}
