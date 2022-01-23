package com.zzr.springboot_basic.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:29 上午
 */
public class LogoutEvent extends ApplicationEvent {

    private String logoutName;

    public LogoutEvent(Object source, String logoutName) {
        super(source);
        this.logoutName = logoutName;
    }

    public String getLogoutName() {
        return logoutName;
    }

    @Override
    public String toString() {
        return "LogoutEvent{" +
                "logoutName='" + logoutName + '\'' +
                '}';
    }
}
