package com.zzr.concurrency.basic;

import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author zhaozhirong
 * @date 2022/1/29 8:03 下午
 */
public class QueueTest {

    public static void main(String[] args) throws InterruptedException {
      test();
      Thread.currentThread().interrupt();
      Thread.currentThread().isInterrupted();
    }

    private static void test() throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.put(1);
        queue.put(2);
        queue.put(3);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
