package com.AbCodes.loosely_coupled_spring_framework.game;

public class GameRunner {
    private GamingConsole game;


    public GameRunner(GamingConsole game){
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
