package com.springexample.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springexample.demo.Student;

public class Main {
    public static void main(String[] args) {
        //Resource resource=new ClassPathResource("applicationContext.xml");
        //BeanFactory factory=new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student)context.getBean("studentbean");
        System.out.println(student);
    }
}