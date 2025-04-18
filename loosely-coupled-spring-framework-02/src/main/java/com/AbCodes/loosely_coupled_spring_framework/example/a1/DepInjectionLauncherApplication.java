package com.AbCodes.loosely_coupled_spring_framework.example.a1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
class YourBusinessClass{

    //Constructor Dependency Injection(Even if we dont use @Autowired Spring uses the constructor to create Objects AKA Beans
    //This is the most recommended approach by Spring Team for injecting as all the initialization happens in 1 method
    //@Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection -  yourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //This is an example of Field Injection
    //@Autowired
    Dependency1 dependency1;

    //@Autowired
    Dependency2 dependency2;
    public String toString(){
        return "Using"+ dependency1 + "And" + dependency2;
    }

    //Setter Injection
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - setDependency1");
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("SetterInjection - setDependency2");
//        this.dependency2 = dependency2;
//    }


}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
          System.out.println(context.getBean(YourBusinessClass.class));
        }


    }
}
