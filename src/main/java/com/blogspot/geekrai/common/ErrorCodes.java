package com.blogspot.geekrai.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * Provides Error Codes for Service Exceptions.
 * It abstracts the errorCode and the Http Status code of the error.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ErrorCodes {
    VALIDATION("validation_failed", HttpStatus.BAD_REQUEST);

    final String errorCode;
    final HttpStatus httpStatus;
    
}