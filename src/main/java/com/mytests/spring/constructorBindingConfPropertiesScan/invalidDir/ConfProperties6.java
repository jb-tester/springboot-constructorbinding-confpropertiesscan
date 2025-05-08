package com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir;

import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConstructorBinding;
/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * <p><b> Not included via @ConfigurationPropertiesScan  </b></p>
 * <p><b> or @EnableConfigurationProperties  </b></p>
 * <p><b> but included via @Import </b></p>
 * <p><b> Should report error if @Import is uncommented in BeansConfig class  </b></p>
 **/

@ConfigurationProperties("my.props6")
public class ConfProperties6 {

   // @ConstructorBinding
    public ConfProperties6(String prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    String prop1;
    String prop2;

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }
}