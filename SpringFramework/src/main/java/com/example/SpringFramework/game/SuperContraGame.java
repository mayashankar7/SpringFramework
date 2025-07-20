package com.example.SpringFramework.game;

public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("Super Contra Jump");
    }
    public void down() {
        System.out.println("Super Contra Slide");
    }

    public void left() {
        System.out.println("Super Contra Go Back");
    }

    public void right() {
        System.out.println("Super Contra Accelerate");
    }
}
