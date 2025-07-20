package com.example.SpringFramework;

import com.example.SpringFramework.game.GameRunner;
import com.example.SpringFramework.game.MarioGame;
import com.example.SpringFramework.game.PacManGame;
import com.example.SpringFramework.game.SuperContraGame;

public class App01GamingBasic {

    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();
        PacManGame pacManGame = new PacManGame();
        GameRunner gameRunner = new GameRunner(pacManGame);
        gameRunner.run();
    }
}
