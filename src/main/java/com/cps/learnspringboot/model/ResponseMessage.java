package com.cps.learnspringboot.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage {
    private int code;
    private String message;
}
