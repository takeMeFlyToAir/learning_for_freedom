package com.zzr.design_patterns.activeobject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhaozhirong
 * @date 2022/1/11 8:37 下午
 */
public class ActiveCreature {

    private static final Logger logger = LoggerFactory.getLogger(ActiveCreature.class.getName());

    private final Thread thread;

    private final String name;

    private final BlockingQueue<Runnable> requests;

    private int status;

    public ActiveCreature(String name) {
        this.name = name;
        this.status = 0;
        this.requests = new LinkedBlockingQueue<>();
        this.thread = new Thread(() -> {
            boolean infinite = true;
            while (infinite){
                try {
                    requests.take().run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    if(status != 0){
                        logger.error("Thread was interrupted. --> {}", e.getMessage());
                    }
                    infinite = false;
                    Thread.currentThread().interrupt();
                }
            }

        });
        this.thread.start();
    }

    public void eat() throws InterruptedException {
        requests.put(() -> {
            logger.info("{} is eating!",name());
            logger.info("{} has finished eating!",name());
        });
    }

    public void roam() throws InterruptedException {
        requests.put(() ->
                logger.info("{} has started to roam in the wastelands.",name())
        );
    }

    public String name() {
        return this.name;
    }

    public void kill(){
        this.status = 1;
        thread.interrupt();
    }

    public int getStatus() {
        return this.status;
    }


    public static void main(String[] args) {
        logger.info("xxx");
    }

}
