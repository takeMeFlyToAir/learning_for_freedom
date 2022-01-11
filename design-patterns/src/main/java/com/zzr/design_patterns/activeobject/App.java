package com.zzr.design_patterns.activeobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * @author zhaozhirong
 * @date 2022/1/11 8:46 下午
 */
public class App implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(App.class.getName());

    private static final int NUM_CREATURES = 3;

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    @Override
    public void run() {

        ArrayList<ActiveCreature> executors = new ArrayList<>();

        try {
            for (int i = 0; i < NUM_CREATURES; i++) {
                King king = new King(King.class.getSimpleName() + i);
                king.eat();
                king.roam();
                executors.add(king);
            }
            Thread.sleep(1000);
        }catch (InterruptedException e){
            logger.error(e.getMessage());
            Thread.currentThread().interrupt();
        }finally {
            for (ActiveCreature executor : executors) {
                executor.kill();
            }
        }
    }
}
