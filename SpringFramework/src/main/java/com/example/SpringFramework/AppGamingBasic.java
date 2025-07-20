package com.example.SpringFramework;

import com.example.SpringFramework.game.GameRunner;
import com.example.SpringFramework.game.MarioGame;

public class AppGamingBasic {

    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
