package com.AbCodes.loosely_coupled_spring_framework.example.Exercise;
import org.springframework.stereotype.Component;
import java.util.Arrays;
@Component
public class BusinessLayer {
    private DataService dataService;
    //Constructor Autowiring
    public BusinessLayer (DataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.data()).max().orElse(0);
    }
}
