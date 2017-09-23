package com.blogspot.geekrai.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class DemoException extends Exception {
    private final ErrorCodes error;
    private final String message;
}