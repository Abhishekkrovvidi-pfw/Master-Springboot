package com.AbCodes.loosely_coupled_spring_framework;

import com.AbCodes.loosely_coupled_spring_framework.game.CounterStrike;
import com.AbCodes.loosely_coupled_spring_framework.game.GameRunner;
import com.AbCodes.loosely_coupled_spring_framework.game.GamingConsole;
import com.AbCodes.loosely_coupled_spring_framework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game (){
        //return new CounterStrike();
        return new MarioGame();
    }
    @Bean
    public GameRunner gameRunner(){
        return new GameRunner(game());
    }

}
