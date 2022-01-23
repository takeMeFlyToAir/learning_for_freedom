package com.zzr.springboot_basic.event.listener;

import com.zzr.springboot_basic.event.LoginEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:33 上午
 */
@Slf4j
@Component
public class LoginListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return LoginEvent.class.isAssignableFrom(aClass);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        log.info("receive loginEvent, {}", applicationEvent);

    }
}
