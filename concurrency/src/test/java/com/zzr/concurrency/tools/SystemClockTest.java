package com.zzr.concurrency.tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author zhaozhirong
 * @date 2022/1/16 7:36 下午
 */
public class SystemClockTest {


    private static final int threadCount = 100;

    private static final int count = 1000000;


    @Test
    public void testSystemCurrentTimeMillis() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        ArrayList<Future<Long>> futures = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Future<Long> submit = executorService.submit(() -> System.currentTimeMillis());
            futures.add(submit);
        }
        for (Future<Long> future : futures) {
            future.get();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testSystemCurrentTimeMillis=" + (endTime - startTime));
        executorService.shutdown();
        while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
        }
    }

    @Test
    public void testSystemClock() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        ArrayList<Future<Long>> futures = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Future<Long> submit = executorService.submit(() -> SystemClock.now());
            futures.add(submit);
        }
        for (Future<Long> future : futures) {
            future.get();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testSystemClock=" + (endTime - startTime));
        executorService.shutdown();
        while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
        }
    }

}
