package com.zzr.springboot_basic.controller;

import com.zzr.springboot_basic.event.LoginEvent;
import com.zzr.springboot_basic.event.LogoutEvent;
import com.zzr.springboot_basic.event.RegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaozhirong
 * @date 2022/1/23 9:40 上午
 */
@Slf4j
@RestController
@RequestMapping(value = "/event")
public class EventController {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping(value = "/register")
    public String register() {
        applicationEventPublisher.publishEvent(new RegisterEvent(this, "zzr1"));
        return "register";
    }

    @GetMapping(value = "/login")
    public String login() {
        applicationEventPublisher.publishEvent(new LoginEvent(this, "zzr1"));
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        applicationEventPublisher.publishEvent(new LogoutEvent(this, "zzr1"));
        return "logout";
    }

}
