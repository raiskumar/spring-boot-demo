package com.blogspot.geekrai.common;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DemoException extends Exception {
    private String reason;

    public DemoException(String reason){
        this.reason = reason;
    }
}
