package com.wandonium.springframeworkdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Hillary Wando
 */
public class SpringFrameworkDemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        //Doctor doctor = new Doctor();
        // Creating object using Spring's XML-based dependency injection.
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        
        // Making use of the XML id from the spring.xml resource
        Nurse nurse = (Nurse) context.getBean("nurse");
        nurse.assist();
        
        // Making use of the Staff interface
        Staff doctor2 = context.getBean(Doctor.class);
        doctor2.assist();
        
        Staff nurse2 = context.getBean(Nurse.class);
        nurse2.assist();
    }
}
