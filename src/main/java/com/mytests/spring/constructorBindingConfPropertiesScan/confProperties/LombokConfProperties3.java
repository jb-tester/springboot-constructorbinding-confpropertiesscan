package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@AllArgsConstructor
@ConfigurationProperties(prefix = "my.props9")
public class LombokConfProperties3 {
    @NonNull
    private final String prop1;
    private final String prop2;
}