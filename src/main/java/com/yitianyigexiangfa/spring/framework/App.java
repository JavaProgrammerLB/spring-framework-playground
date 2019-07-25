package com.yitianyigexiangfa.spring.framework;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Shape triangle = (Triangle)xmlBeanFactory.getBean("triangle");
        Drawing drawing = new Drawing(triangle);
        drawing.drawAShape();
    }
}
