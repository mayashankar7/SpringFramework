package com.example.SpringFramework.game;

public class GameRunner {

    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
