package com.begin.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("Jump");
    }

    @Override
    public void down(){
        System.out.println("Into the hole");
    }

    @Override
    public void left(){
        System.out.println("Run");
    }

    @Override
    public void right(){
        System.out.println("Slide");
    }
}
