package com.blogspot.geekrai.service;

import com.blogspot.geekrai.common.PropertyReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    PropertyReader propertyReader;

    @Autowired
    MessageSource message;

    public String sayHello(String name) {
        System.out.println("Environment ------"+propertyReader.getFromApplicationProperties("env"));
        return propertyReader.getFromMesssagesProperties("GREETING_TEXT") + name;
    }
}
