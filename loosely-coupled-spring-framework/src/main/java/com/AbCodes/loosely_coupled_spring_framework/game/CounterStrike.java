package com.AbCodes.loosely_coupled_spring_framework.game;

public class CounterStrike implements GamingConsole {
    public void up(){
        System.out.println("move forward");
    }
    public void down(){
        System.out.println("move back");
    }
    public void left(){
        System.out.println("Move left");
    }
    public void right(){
        System.out.println("Move Right");
    }


}
