package com.zzr.concurrency.basic;

public class TestEscape {
    private String name;

    public TestEscape(String name) throws InterruptedException {

        new Thread(new EscapeRunnable()).start();
        Thread.sleep(1); //增加构造函数的负责度，加长name初始化时间，否则在测试过程中，并没有发生其为null的情况
        this.name = name;

    }

    private class EscapeRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new TestEscape("woniu");
    }
}