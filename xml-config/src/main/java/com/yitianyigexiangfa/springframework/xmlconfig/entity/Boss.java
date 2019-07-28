package com.yitianyigexiangfa.springframework.xmlconfig.entity;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
public class Boss {

    private Car car;

    private Office office;

    public Boss(Car car, Office office) {
        this.car = car;
        this.office = office;
    }

    public void selfIntroduce(){
        System.out.println("car is " + car + "office is " + office);
    }
}