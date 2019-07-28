package com.yitianyigexiangfa.springframework.xmlconfig.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
@Component
public class Boss {

    private Car car;

    private Office office;

    @Autowired
    public Boss(Car car, Office office) {
        this.car = car;
        this.office = office;
    }

    public void selfIntroduce(){
        System.out.println("car is " + car + "office is " + office);
    }
}
