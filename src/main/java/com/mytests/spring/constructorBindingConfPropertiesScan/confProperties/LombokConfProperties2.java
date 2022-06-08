package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "my.props8")
public class LombokConfProperties2 {

    private  String prop1;
    private  String prop2;
}