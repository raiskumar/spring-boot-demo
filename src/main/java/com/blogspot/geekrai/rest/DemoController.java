package com.blogspot.geekrai.rest;

import com.blogspot.geekrai.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/demo",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.ALL_VALUE)
public class DemoController {

    @Autowired
    HelloService service;

    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    public ResponseEntity<?> hello(@PathVariable("name") String name) {
        String response = service.sayHello(name);
        //return ResponseEntity.ok().build();
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
