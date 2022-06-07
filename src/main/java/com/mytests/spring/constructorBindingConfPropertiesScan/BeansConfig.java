package com.mytests.spring.constructorBindingConfPropertiesScan;

import com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir.ConfProperties5;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * *
 */
@Configuration
//@Import(ConfProperties6.class)
public class BeansConfig {
    @ConfigurationProperties("my.props5") @Bean
    public ConfProperties5 confProperties5() {
        return new ConfProperties5();
    }

    @Bean
    public String fooStr() {
        return "foo";
    }
    @Bean
    public String barStr() {
        return "bar";
    }
}

