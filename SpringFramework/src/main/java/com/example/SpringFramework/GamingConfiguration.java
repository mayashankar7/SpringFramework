package com.example.SpringFramework;

import com.example.SpringFramework.game.*;
import org.springframework.context.annotation.Bean;

public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game());
    }

}
