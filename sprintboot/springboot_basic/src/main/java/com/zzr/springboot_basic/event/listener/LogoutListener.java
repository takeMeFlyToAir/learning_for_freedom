package com.zzr.springboot_basic.event.listener;

import com.zzr.springboot_basic.event.LogoutEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:33 上午
 */
@Slf4j
@Component
public class LogoutListener {

    @EventListener
    public void logoutListener(LogoutEvent logoutEvent) {
        log.info("receive logoutEvent, {}", logoutEvent);

    }
}
