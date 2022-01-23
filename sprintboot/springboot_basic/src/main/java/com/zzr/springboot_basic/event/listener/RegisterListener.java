package com.zzr.springboot_basic.event.listener;

import com.zzr.springboot_basic.event.RegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:33 上午
 */
@Slf4j
@Component
public class RegisterListener implements ApplicationListener<RegisterEvent> {

    @Override
    public void onApplicationEvent(RegisterEvent registerEvent) {
        log.info("receive registerEvent, {}", registerEvent);
    }
}
