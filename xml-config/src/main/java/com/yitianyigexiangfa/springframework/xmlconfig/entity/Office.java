package com.yitianyigexiangfa.springframework.xmlconfig.entity;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
public class Office {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Office{" +
               "address='" + address + '\'' +
               '}';
    }
}
