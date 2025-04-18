package com.AbCodes.loosely_coupled_spring_framework.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguraion {
    record Person (String name , int age, Address address){};
    record Address (String Street ,String City,  int Zip){};
    @Bean(name = "Myname")
    public String name(){
        return "Abhishek";
    }
    @Bean
    public int age(){
        return 25;
    }
    @Bean
    public Person p(){
        return new Person("Ab", 19, new Address("404 leutkenhaus blvd", "Wentzville", 63385));
    }
    @Bean
    @Primary
    public Address address(){
        return new Address("1500 East Broadway Road", "Tempe", 85282);
    }
    @Bean
    @Qualifier("address3Qualifier")
    public Address address2(){
        return new Address("ChippewaMotel", "St.Louis", 43325);
    }
    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier")Address addres){
        return new Person(name , age, addres);
    }
    @Bean(name = "address3")
    public Address address3(){
        return new Address("3018 Canterbury blvd", "FortWayne", 63385);
    }

    @Bean
    public Person person2UsingMethods(){
        return new Person(name(), age(),address2());
    }

    @Bean Person person3UsingParameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }


}
