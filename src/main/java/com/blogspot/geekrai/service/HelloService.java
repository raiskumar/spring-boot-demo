package com.blogspot.geekrai.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    //@Autowired
    //MessageReader messageReader;
    //MessageSource messageSource;

    //@Autowired
    //private Environment env;

    public String sayHello(String name) {
        //System.out.println(env.getProperty("env"));
        //return messageSource.getMessage("GREETING_TEXT", null, null)+ name;
        return "hello, " + name;
    }
}
