package com.AbCodes.loosely_coupled_spring_framework;

import com.AbCodes.loosely_coupled_spring_framework.game.GameRunner;
import com.AbCodes.loosely_coupled_spring_framework.game.Pacman;

public class App01GamingBasic {
    public static void main(String[] args) {
        //var game = new MarioGame();
        //var game = new CounterStrike();
        var game = new Pacman();// Object Creation
        var gameRunner = new GameRunner(game);
        //Object Creation + Wiring of dependency where game is a dependency
        gameRunner.run();

    }
}
