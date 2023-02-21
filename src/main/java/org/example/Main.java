package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("beans.xml");
        Person person=(Person) applicationContext.getBean("person");
        person.getAddresses();
        person.getIdentity();
        person.getPhones();
    }
}