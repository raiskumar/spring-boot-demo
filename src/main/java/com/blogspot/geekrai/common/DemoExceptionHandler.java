package com.blogspot.geekrai.common;

import com.blogspot.geekrai.rest.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class DemoExceptionHandler {
    /**
     * Centralized Handler for all Application Exceptions (PointExceptions)
     *
     * @param ex PointExceptions Object
     * @return ResponseEntity object to be returned to caller
     */
    @ExceptionHandler(value = {DemoException.class})
    public ResponseEntity<?> handlePointException(DemoException ex) {
        //log.error(requestMetaInfo.getTraceId() + ":", ex);
        //return new ResponseEntity<>(buildErrorResponseFromPointException(ex), null, ex.getErrorCodes().getHttpStatus());
        return null;
    }


    private ErrorResponse buildErrorResponseFromPointException(DemoException ex) {
        /*return ErrorResponse.builder()
                .code(ex.getErrorCodes().getErrorCode())
                .detail(ex.getMessage())
                .build();*/
        //return ErrorResponse
        return null;
    }

}
