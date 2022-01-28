package com.zzr.springboot_basic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/1/21 6:25 下午
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "project")
public class ProjectConfig {

    private Long id;

    private Map<String, Object> basic;

}
