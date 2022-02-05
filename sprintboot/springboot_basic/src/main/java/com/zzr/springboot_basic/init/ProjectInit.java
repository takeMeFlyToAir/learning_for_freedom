package com.zzr.springboot_basic.init;

import com.zzr.springboot_basic.config.FkJava;
import com.zzr.springboot_basic.config.ProjectConfig;
import com.zzr.springboot_basic.util.ApplicationUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/1/21 6:30 下午
 */
@Slf4j
@Component
public class ProjectInit implements InitializingBean, CommandLineRunner {

    @Autowired
    private ProjectConfig projectConfig;

    @Autowired
    private FkJava fkJava;

    @Override
    public void afterPropertiesSet() {
        Map<String, Object> basic = projectConfig.getBasic();
        System.out.println(projectConfig.getId().getClass());
        System.out.println(projectConfig.getBasic().get("count").getClass());
        System.out.println(projectConfig.getBasic().get("time").getClass());

    }


    @Override
    public void run(String... args) throws Exception {
        ProjectConfig bean = ApplicationUtil.getBean(ProjectConfig.class);
        System.out.println(bean.getClass().getSimpleName());
        System.out.println(fkJava.toString());
    }
}
