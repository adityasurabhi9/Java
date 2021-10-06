package com.begin.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner
{
    @Autowired
    private GamingConsole game;
    //private SuperContraGame game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void runGame(){
        game.up();
        game.left();
        game.down();
        game.right();
    }
}
