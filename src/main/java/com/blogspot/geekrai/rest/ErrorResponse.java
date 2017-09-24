package com.blogspot.geekrai.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Error Response returned to the caller if any issue happens
 */
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
    private String code;   // Mandatory -Application Error String like "access_denied"
    private String detail;  // optional
    private String reference;  // Optional
    private List<String> headers;// Optional
    private String body;
}
