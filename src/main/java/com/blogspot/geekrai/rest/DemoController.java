package com.blogspot.geekrai.rest;

import com.blogspot.geekrai.common.DemoException;
import com.blogspot.geekrai.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/demo",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.ALL_VALUE)
@Slf4j(topic = "demoApi")
public class DemoController {

    @Autowired
    HelloService service;

    /**
     * URL: http://localhost:8080/v1/demo/hello/{name}
     *
     * @param name user name
     * @return Greeting text for user
     */
    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    public ResponseEntity<?> hello(@PathVariable("name") String name) throws DemoException{
        //log.info("inside controller class");
        String response = service.sayHello(name);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
