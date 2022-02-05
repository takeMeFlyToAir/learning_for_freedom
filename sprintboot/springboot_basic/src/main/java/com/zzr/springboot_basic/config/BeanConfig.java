package com.zzr.springboot_basic.config;

import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/2/5 9:15 上午
 */
@Component
public class BeanConfig {

    @Bean
    public FkJava fkJava() {
        YamlMapFactoryBean factoryBean = new YamlMapFactoryBean();
        factoryBean.setResources(new ClassPathResource("book/fk.yml"));
        Map<String, Object> map = factoryBean.getObject();
        return FkJava.fromMap(map);
    }

}
