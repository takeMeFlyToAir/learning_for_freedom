package com.zzr.springboot_basic.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:29 上午
 */
public class RegisterEvent extends ApplicationEvent {

    private String registerName;

    public RegisterEvent(Object source, String registerName) {
        super(source);
        this.registerName = registerName;
    }

    @Override
    public String toString() {
        return "RegisterEvent{" +
                "registerName='" + registerName + '\'' +
                '}';
    }
}
