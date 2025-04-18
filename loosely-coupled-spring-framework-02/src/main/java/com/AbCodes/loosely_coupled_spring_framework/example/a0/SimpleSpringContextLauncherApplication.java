package com.AbCodes.loosely_coupled_spring_framework.example.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.lang.model.util.SimpleElementVisitor14;
import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
