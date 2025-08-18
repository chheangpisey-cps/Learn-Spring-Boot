package com.cps.learnspringboot.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Data annotation to reduce boilerplate code in their model or DTO (Data Transfer Object) classes.
//Value annotation a read-only (immutable) alternative - Makes all fields private and final by default.
@Component
@ConfigurationProperties(prefix = "test.db")
@Data
public class DatabaseInfo {
    private String url;
    private String username;
    private String password;
}
