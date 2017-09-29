package com.blogspot.geekrai.service;

import com.blogspot.geekrai.common.DemoException;
import com.blogspot.geekrai.common.PropertyReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j(topic = "demoApi")
public class HelloService {
    @Autowired
    PropertyReader propertyReader;

    @Autowired
    MessageSource message;

    public String sayHello(String name) throws DemoException{
        if(Objects.isNull(name) || name.length() < 2){
            throw new DemoException("valid name is required", DemoException.ErrorCodes.BAD_REQUEST);
        }
        log.info(" Hello Service, name =", name);
        return propertyReader.getFromMesssagesProperties("GREETING_TEXT") + name;
    }
}
