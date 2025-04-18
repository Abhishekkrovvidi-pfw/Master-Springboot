package com.AbCodes.loosely_coupled_spring_framework;

import com.AbCodes.loosely_coupled_spring_framework.game.GameRunner;
import com.AbCodes.loosely_coupled_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }


    }
}
