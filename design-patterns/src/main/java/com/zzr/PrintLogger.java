package com.zzr;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:46 下午
 */
public class PrintLogger {

    public static void info(Object... args) {
        System.out.println(Arrays.stream(args).map(String::valueOf)
                .collect(Collectors.joining(",")));
    }

}
