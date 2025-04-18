package com.AbCodes.loosely_coupled_spring_framework.example.Exercise;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
@ComponentScan
public class RealWorldExampleSpringContextApplication {
    public static void main(String [] args){
        try (var context = new AnnotationConfigApplicationContext(RealWorldExampleSpringContextApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessLayer.class).findMax());

        }
    }
}
