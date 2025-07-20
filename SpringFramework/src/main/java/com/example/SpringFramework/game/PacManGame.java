package com.example.SpringFramework.game;

public class PacManGame implements GamingConsole{
    public void up() {
        System.out.println("PacMan Move Up");
    }

    public void down() {
        System.out.println("PacMan Move Down");
    }

    public void left() {
        System.out.println("PacMan Move Left");
    }

    public void right() {
        System.out.println("PacMan Move Right");
    }
}
