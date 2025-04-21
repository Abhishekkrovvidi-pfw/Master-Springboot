package com.AbCodes.loosely_coupled_spring_framework.example.g1;

import com.AbCodes.loosely_coupled_spring_framework.example.Exercise.DataService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Named
// @Component
class BusinessService{
   private Data1Service dataService;

    //Setter Injection
    @Inject
    // @Autowired
   public void setDataService(Data1Service dataService){
        System.out.println("Setter INjection is performed");
       this.dataService = dataService;
   }

   public Data1Service getDataService(){

       return dataService;
   }

   public BusinessService(Data1Service dataService){
       super();
       this.dataService = dataService;
   }

}
//@Component
@Named
class Data1Service{

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
