package com.zzr.springboot_basic.init;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhaozhirong
 * @date 2022/2/4 5:43 下午
 */
public class ApplicationContextInitializerDemo implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("ApplicationContextInitializer initialize");
    }

}
