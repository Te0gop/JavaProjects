package com.spring.carwash.model;

import java.util.Objects;

public class Driver {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Driver() {
    }

    public Driver(int id, String name, String surname, String phone, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return id == driver.id && Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname) && Objects.equals(phone, driver.phone) && Objects.equals(address, driver.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone, address);
    }
}
