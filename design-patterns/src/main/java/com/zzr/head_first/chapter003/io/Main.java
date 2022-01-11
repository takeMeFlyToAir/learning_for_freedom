package com.zzr.head_first.chapter003.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:41 上午
 */
public class Main {
    public static void main(String[] args) {
        String tip = "I Know the DecoratorPattern therefore I RULE!";
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new ByteArrayInputStream(tip.getBytes())
                    )
            );
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
