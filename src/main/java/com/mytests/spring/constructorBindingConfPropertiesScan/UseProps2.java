package com.mytests.spring.constructorBindingConfPropertiesScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * *
 */
@Service
public class UseProps2 {

    @Value("${my.props1.prop1}")
    String someValue;

    @Value("${my.props00.prop1}")
    String someValue2;

    @Autowired
    private Environment environment;

    public void useThem(){

        System.out.println(environment.getProperty("my.props1.prop2"));
        System.out.println(environment.getProperty("my.props00.prop2"));
    }
}
