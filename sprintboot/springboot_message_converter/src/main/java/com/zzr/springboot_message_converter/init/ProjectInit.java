package com.zzr.springboot_message_converter.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.ApplicationContext;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;

/**
 * @author zhaozhirong
 * @date 2022/1/27 4:52 下午
 */
@Slf4j
@Component
public class ProjectInit implements InitializingBean {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        HttpMessageConverters bean = applicationContext.getBean(HttpMessageConverters.class);
        for (HttpMessageConverter<?> converter : bean.getConverters()) {
            log.info(converter.getClass().getSimpleName());
        }
    }
}
