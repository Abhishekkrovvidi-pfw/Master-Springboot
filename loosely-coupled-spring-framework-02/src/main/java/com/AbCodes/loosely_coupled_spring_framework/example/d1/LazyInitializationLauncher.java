package com.AbCodes.loosely_coupled_spring_framework.example.d1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}
@Component
@Lazy
class ClassB{
    private ClassA classA;
    public ClassB(ClassA classA){
        super();
        //Logic
        System.out.println("Some initialization logic");
        this.classA = classA;
    }
    public void doSomething(){
        System.out.println("Do Something");
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncher {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(LazyInitializationLauncher.class)) {
        System.out.println("Initialization of context is completed");
        context.getBean(ClassB.class).doSomething();
        }
    }
}
