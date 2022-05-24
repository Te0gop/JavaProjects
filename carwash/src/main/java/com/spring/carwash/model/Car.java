package com.spring.carwash.model;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String color;
    private Driver driver;
    private int year;

    public Car() {
    }

    public Car(int id, String model, String color, Driver driver, int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.driver = driver;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", driver=" + driver +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, driver, year);
    }
}
