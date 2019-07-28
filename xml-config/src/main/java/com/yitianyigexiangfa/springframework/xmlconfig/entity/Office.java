package com.yitianyigexiangfa.springframework.xmlconfig.entity;

import org.springframework.stereotype.Component;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
@Component
public class Office {

    private String address = "hangzhou";

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
