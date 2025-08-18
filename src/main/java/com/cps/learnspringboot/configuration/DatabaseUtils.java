package com.cps.learnspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUtils {
    @Bean("url")
    public String url() { return "testURL1"; }

    @Bean("username")
    public String username() { return "testUserName1"; }

    @Bean("password")
    public String password() { return "testPassword1"; }
}
