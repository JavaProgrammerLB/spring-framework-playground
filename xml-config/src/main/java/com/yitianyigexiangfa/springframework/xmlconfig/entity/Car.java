package com.yitianyigexiangfa.springframework.xmlconfig.entity;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
public class Car {

    private String brand;

    private int price;

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
