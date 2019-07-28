package com.yitianyigexiangfa.springframework.xmlconfig;

import com.yitianyigexiangfa.springframework.xmlconfig.entity.Boss;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Bill Lau
 * @date 2019-07-28
 */
@ComponentScan(value = "com.yitianyigexiangfa.springframework.xmlconfig")
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Boss boss = (Boss)context.getBean("boss");
        boss.selfIntroduce();
        context.close();
    }
}
