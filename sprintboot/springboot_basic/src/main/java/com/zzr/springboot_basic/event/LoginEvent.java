package com.zzr.springboot_basic.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:29 上午
 */
public class LoginEvent extends ApplicationEvent {

    private String loginName;

    public LoginEvent(Object source, String loginName) {
        super(source);
        this.loginName = loginName;
    }

    public String getLoginName() {
        return loginName;
    }

    @Override
    public String toString() {
        return "LoginEvent{" +
                "loginName='" + loginName + '\'' +
                '}';
    }
}
