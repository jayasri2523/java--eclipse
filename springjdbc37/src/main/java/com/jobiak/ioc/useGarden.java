package com.jobiak.ioc;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class useGarden {

 public static void main(String[] args) {
  //Garden garden=new Garden();
  //garden.setFruits(new ArrayList());
  
  ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
  System.out.println(context.containsBean("garden"));
  Garden ref=(Garden)context.getBean("garden");
  System.out.println(ref);

	
 }
}