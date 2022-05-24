package com.spring.carwash.web;

import com.spring.carwash.model.Car;
import com.spring.carwash.model.Driver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carWasherController")
public class CarWasherController {

    @RequestMapping("/cars")
    @ResponseBody
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        Driver driver1 = new Driver(1, "Walter", "White", "+359343454632", "St.George str.");
        Driver driver2 = new Driver(2, "John", "Smith", "+359343454442", "St.Patrick str.");
        Driver driver3 = new Driver(3, "John", "Carter", "+359343452221", "St.Lucas str.");
        Car car1 = new Car(1, "FIAT", "Red", driver1, 2018);
        Car car2 = new Car(2, "Opel", "Blue", driver2, 2019);
        Car car3 = new Car(3, "Citroen", "Gray", driver3, 2020);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }
}
