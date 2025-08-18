package com.cps.learnspringboot.services.implementation;

import com.cps.learnspringboot.services.UserService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service("userService")
//@Primary
@Profile("prod")
//@ConditionalOnProperty(name = "app.database.type", havingValue = "H2")
public class UserServiceImp implements UserService {
    @Value("${test.connection.max.limit}")
    private String maxConnection;

    @PostConstruct
    public void init() {
        log.info("UserServiceImp init");
    }

    @Override
    public int getMaxConnection() {
        return Integer.parseInt(maxConnection);
    }
}
