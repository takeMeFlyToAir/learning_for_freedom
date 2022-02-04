package com.zzr.springboot_basic.init;

import com.zzr.springboot_basic.config.ProjectConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/1/21 6:30 下午
 */
@Slf4j
@Component
public class ProjectInit implements InitializingBean{

    @Autowired
    private ProjectConfig projectConfig;

    @Override
    public void afterPropertiesSet() {
        Map<String, Object> basic = projectConfig.getBasic();
        System.out.println(projectConfig.getId().getClass());
        System.out.println(projectConfig.getBasic().get("count").getClass());
        System.out.println(projectConfig.getBasic().get("time").getClass());
    }


}
