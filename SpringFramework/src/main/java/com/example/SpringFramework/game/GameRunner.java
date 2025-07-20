package com.example.SpringFramework.game;

public class GameRunner {

    MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Running the game: "+marioGame);
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
