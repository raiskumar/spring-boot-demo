package com.blogspot.geekrai.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
@AllArgsConstructor
public class DemoException extends Exception {
    private String reason;
    private final ErrorCodes errorCodes;

    @AllArgsConstructor
    @Getter
    public static enum ErrorCodes{
        BAD_REQUEST("invalid_request", HttpStatus.BAD_REQUEST);

        private final String errorCode;
        private final HttpStatus httpStatus;
    }
}
