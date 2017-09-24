package com.blogspot.geekrai.service;

import com.blogspot.geekrai.common.PropertyReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class HelloService {
    @Autowired
    PropertyReader propertyReader;

    @Autowired
    MessageSource message;

    public String sayHello(String name) {
        if(Objects.isNull(name) || name.length() < 2){
            throw new IllegalArgumentException("Valid name is required !");
        }
        System.out.println("Environment ------"+propertyReader.getFromApplicationProperties("env"));
        return propertyReader.getFromMesssagesProperties("GREETING_TEXT") + name;
    }
}
