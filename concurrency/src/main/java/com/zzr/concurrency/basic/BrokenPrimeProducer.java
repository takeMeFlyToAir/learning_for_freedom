package com.zzr.concurrency.basic;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author zhaozhirong
 * @date 2022/2/3 9:18 上午
 */
public class BrokenPrimeProducer extends Thread{

    private final BlockingQueue<BigInteger> queue;

    private volatile boolean cancelled = false;

    public BrokenPrimeProducer(BlockingQueue<BigInteger> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            BigInteger p = BigInteger.ONE;
            while (!Thread.currentThread().isInterrupted()){
                this.queue.put(p = p.nextProbablePrime());
                System.out.println(this.queue.size());
            }
            System.out.println("cancelled1");
        } catch (InterruptedException e) {
            System.out.println("cancelled2");

        }
    }

    public void cancel(){
        interrupt();
    }

    public static void main(String[] args) {
        BlockingQueue<BigInteger> queue = new LinkedBlockingQueue<>(10);
        BrokenPrimeProducer brokenPrimeProducer = new BrokenPrimeProducer(queue);
        brokenPrimeProducer.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("cancel start");
        brokenPrimeProducer.cancel();
        System.out.println("cancel end");
        try {
            System.out.println("xxx1");
            TimeUnit.SECONDS.sleep(5);
            System.out.println("xxx2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("xxx3");

    }


}
