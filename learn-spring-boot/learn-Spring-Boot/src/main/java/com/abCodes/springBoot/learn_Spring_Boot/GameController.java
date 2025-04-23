package com.abCodes.springBoot.learn_Spring_Boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GameController {
    //Games
    //GAme: id, name, Author
    @RequestMapping("/games")
    public List<Games> getALlGames(){
        return Arrays.asList(
                new Games(1, "CSGO", "Valve"),
                new Games(2, "Valorant", "RiotGames"),
                new Games(3, "Dota2", "Valve"),
                new Games(4, "LeagueofLegends", "RiotGames"),
                new Games(5, "AssasinsCreedRouge", "UBISoft"),
                new Games(6, "Cricket2007", "EA sports")
        );
    }
}
