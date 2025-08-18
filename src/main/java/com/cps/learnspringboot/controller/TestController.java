//package com.cps.learnspringboot.controller;
//
//import com.cps.learnspringboot.model.DatabaseInfo;
//import com.cps.learnspringboot.services.UserService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//@RestController
//@RequestMapping("/test")
//@RequiredArgsConstructor //RequiredArgsConstructor generates a constructor that takes as arguments all the fields
//@Slf4j //Using for log debug
//public class TestController {
//
//    private final DatabaseInfo databaseInfo;
//
//    /**Qualifier is an annotation used with @Autowired (or constructor injection) to tell Spring which bean to inject when multiple candidates exist
//     * When using Qualifier need to command close annotation @RequiredArgsConstructor*/
////    public TestController(@Qualifier("secondaryDatabase") DatabaseInfo databaseInfo) {
////        this.databaseInfo = databaseInfo;
////    }
//
//    private final UserService userService;
//
//    @GetMapping
//    public ResponseEntity<Map<String, Object>> testGet() {
//        final var map = new HashMap<String, Object>();
//        map.put("test", "testSuccess");
//        map.put("maxConnection", userService.getMaxConnection());
//        map.put("databaseInfo", databaseInfo);
//        log.info("<===============**************====================>");
//        log.info("testGet{}", databaseInfo);
//
//        return ResponseEntity.ok(map);
//    }
//}
