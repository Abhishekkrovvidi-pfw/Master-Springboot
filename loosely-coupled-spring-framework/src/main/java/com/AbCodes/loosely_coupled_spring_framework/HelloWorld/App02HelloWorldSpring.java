package com.AbCodes.loosely_coupled_spring_framework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //Launch a Spring Context
        var context=
       new  AnnotationConfigApplicationContext(HelloWorldConfiguraion.class);
        //Configure the things we want spring to Manage- @Configuration
        //HelloWorldConfig class
        //"name" = Bean
        //Retrieving Beans managed by Spring
        System.out.println(context.getBean("Myname"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("p"));
        System.out.println(context.getBean(HelloWorldConfiguraion.Address.class));
        System.out.println(context.getBean("person2UsingMethods"));
        System.out.println(context.getBean("person3UsingParameters"));
        System.out.println(context.getBean("person5Qualifier"));
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBeanDefinitionCount());


    }
}
