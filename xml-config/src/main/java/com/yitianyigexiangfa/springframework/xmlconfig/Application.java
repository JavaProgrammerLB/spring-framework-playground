package com.yitianyigexiangfa.springframework.xmlconfig;

import com.yitianyigexiangfa.springframework.xmlconfig.entity.Boss;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
public class Application {

    public static void main(String[] args) {
       String[] locations = new String[]{"spring.xml"};
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(locations);
        Boss boss = (Boss)context.getBean("boss");
        boss.selfIntroduce();
        context.close();
    }
}
