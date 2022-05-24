package com.spring.carwash.model;

import java.util.Date;
import java.util.Objects;

public class CarWash {

    private int id;
    private Driver driver;
    private Car car;
    private Date date;
    private int price;

    public CarWash() {
    }

    public CarWash(int id, Driver driver, Car car, Date date, int price) {
        this.id = id;
        this.driver = driver;
        this.car = car;
        this.date = date;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarWash{" +
                "id=" + id +
                ", driver=" + driver +
                ", car=" + car +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarWash carWash = (CarWash) o;
        return id == carWash.id && price == carWash.price && driver.equals(carWash.driver) && car.equals(carWash.car) && date.equals(carWash.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, driver, car, date, price);
    }
}
