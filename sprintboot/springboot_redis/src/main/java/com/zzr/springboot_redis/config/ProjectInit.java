package com.zzr.springboot_redis.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @author zhaozhirong
 * @date 2022/1/25 10:37 上午
 */
@Slf4j
@Component
public class ProjectInit implements InitializingBean {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void afterPropertiesSet() {
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set("name", "zzr");
        log.info(valueOperations.get("name"));
    }
}
