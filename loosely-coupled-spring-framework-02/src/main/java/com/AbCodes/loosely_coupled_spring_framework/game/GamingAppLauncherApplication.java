package com.AbCodes.loosely_coupled_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.AbCodes.loosely_coupled_spring_framework.game")//By mentioning the package we tell spring to scan this specific
//package else spring chooses the default package in which the class GamingAPpLauncherApplication is present
public class GamingAppLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GameRunner.class).run();
        }


    }
}
