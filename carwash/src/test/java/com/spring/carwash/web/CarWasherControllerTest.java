package com.spring.carwash.web;

import com.spring.carwash.model.Car;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import java.util.List;

class CarWasherControllerTest {

    private static RestTemplate restTemplate;

    @BeforeAll
    static void beforeEach() {
        restTemplate = new RestTemplate();
    }

    @Test
    public void getCarsTest() {
        List cars = restTemplate.getForObject("http://localhost:8080/carWasherController/cars", List.class);
    }

    @Test
    public void getCarTest() {
        Car car = restTemplate.getForObject("http://localhost:8080/carWasherController/car/1", Car.class);
    }
}