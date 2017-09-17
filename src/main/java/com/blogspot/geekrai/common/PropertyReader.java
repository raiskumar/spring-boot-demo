package com.blogspot.geekrai.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Util class to read values from messages.properties and application-*.properties
 */
@Component
public class PropertyReader {
    @Autowired
    private Environment env;

    @Autowired
    private MessageSource messageSource;

    /**
     * Reads Values from application.properties and from Active Profile Property file
     * @param key
     * @return value for the given key
     */
    public String getFromApplicationProperties(String key){
        return env.getProperty(key);
    }

    /**
     * Reads Values from Messages.properties file
     * @param key
     * @return value for the given key
     */
    public String getFromMesssagesProperties(String key){
        return messageSource.getMessage(key, null, Locale.ENGLISH);
    }


}
