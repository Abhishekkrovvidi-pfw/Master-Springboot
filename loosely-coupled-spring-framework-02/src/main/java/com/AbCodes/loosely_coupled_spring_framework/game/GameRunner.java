package com.AbCodes.loosely_coupled_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class GameRunner {
    private GamingConsole game;


    public GameRunner(@Qualifier("CsQualifier")GamingConsole game){

        this.game = game;
    }

    public void run(){
        System.out.println("Game is running"+ game);
        game.down();
        game.left();
        game.up();
        game.right();
    }

}
