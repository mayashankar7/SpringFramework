package com.example.SpringFramework;

import com.example.SpringFramework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
