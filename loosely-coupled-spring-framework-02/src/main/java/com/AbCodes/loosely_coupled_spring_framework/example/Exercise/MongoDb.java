package com.AbCodes.loosely_coupled_spring_framework.example.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MongoDb implements DataService{
    @Autowired
    MongoDb mongoDb;
    public int [] data(){
        return new int[]{1,13,25,23,2,50};
    }
}
