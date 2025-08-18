package com.cps.learnspringboot.configuration;

import com.cps.learnspringboot.model.DatabaseInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Configuration is used to mark a class as a source of bean definitions.
 * It tells Spring: This class contains methods annotated with @Bean that define beans for the application context.
 */
@Configuration
public class DatabaseConfiguration {
    //Bean allows multiple beans of the same type, but you need to be careful with naming and injection.
    //If you use annotation @Primary no need to put "primaryDatabase" but for secondaryDatabase user annotation @Order(2)

//    @Bean("primaryDatabase")
//    @Bean
//    @Scope(value = "singleton")
//    @Primary
//    public DatabaseInfo getPrimaryDatabaseInfo() {
//        return new DatabaseInfo("testURL1", "testUserName1", "testPassword1");
//    }
//
//    @Bean
//    public DatabaseInfo getSecondaryDatabaseInfo() {
//        return new DatabaseInfo("testURL2", "testUserName2", "testPassword2");
//    }

    /**
     * Using bean with param
     */
//    @Bean
//    @Scope(value = "singleton")
//    @Primary
//    public DatabaseInfo getPrimaryDatabaseInfo(@Qualifier("url") final String url,
//                                               @Qualifier("username")final String username,
//                                               @Qualifier("password") final String password) {
//        return new DatabaseInfo(url, username, password);
//    }

/*
    @Bean("mysql")
    public DataSource dataSource() {
       final var dataSourceBuilder = DataSourceBuilder.create();
       dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
       dataSourceBuilder.url("jdbc:mysql://localhost:3306/learnspringboot");
       dataSourceBuilder.username("root");
       dataSourceBuilder.password("root");
       return dataSourceBuilder.build();
    }
*/

}
