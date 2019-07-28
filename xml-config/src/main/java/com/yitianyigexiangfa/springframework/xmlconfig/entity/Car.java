package com.yitianyigexiangfa.springframework.xmlconfig.entity;

import org.springframework.stereotype.Component;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
@Component
public class Car {

    private String brand = "BMW";

    private int price = 1000000;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
               "brand='" + brand + '\'' +
               ", price=" + price +
               '}';
    }
}
