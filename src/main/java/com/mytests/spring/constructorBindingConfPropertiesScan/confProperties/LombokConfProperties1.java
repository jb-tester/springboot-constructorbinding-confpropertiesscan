package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "my.props7")
public class LombokConfProperties1 {
    @NonNull
    private final String prop1;
    private final String prop2;
}