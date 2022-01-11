package com.zzr.head_first.chapter001.quack;

/**
 * @author zhaozhirong
 * @date 2022/1/1 5:40 下午
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
