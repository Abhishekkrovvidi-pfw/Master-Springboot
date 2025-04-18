package com.AbCodes.loosely_coupled_spring_framework.example.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("SqlQualifier")
public class SqlData implements DataService{
    @Autowired
    SqlData sqlData;
    public int [] data(){
        return new int[] {1,2,3,4,5,6};
    }
}
