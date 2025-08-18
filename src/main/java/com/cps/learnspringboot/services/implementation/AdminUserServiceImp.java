package com.cps.learnspringboot.services.implementation;

import com.cps.learnspringboot.services.UserService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service("adminUserService")
//@Profile("dev")
//@ConditionalOnMissingBean(name = "accountService")
public class AdminUserServiceImp implements UserService {

    @PostConstruct
    public void init() {
        log.info("AdminUserServiceImp init");
    }

    @Override
    public int getMaxConnection() {
        return 10;
    }
}
