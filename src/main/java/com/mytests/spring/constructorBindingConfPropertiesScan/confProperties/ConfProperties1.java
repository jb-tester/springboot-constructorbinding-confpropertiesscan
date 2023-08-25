package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * *
 <b> Multiple constructors, one with @ConstructorBinding annotation: </b>
 */
@ConfigurationProperties("my.props1")
public class ConfProperties1 {

    String prop1;
    String prop2;
    boolean flag;

    public ConfProperties1(String prop1, String prop2, boolean flag) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.flag = flag;
    }

    @ConstructorBinding
    public ConfProperties1(String prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public boolean isFlag() {
        return flag;
    }
}
