package com.mytests.spring.constructorBindingConfPropertiesScan;

import com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir.ConfProperties3;
import com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir.ConfProperties5;
import com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir.ConfProperties6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ConfigurationPropertiesScan("com.mytests.spring.constructorBindingConfPropertiesScan.confProperties")
@EnableConfigurationProperties(ConfProperties3.class)

public class SpringbootConstructorbindingConfpropertiesscanApplication implements CommandLineRunner {

    @Autowired
    private UseProps useProps;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConstructorbindingConfpropertiesscanApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        useProps.display();
    }
}
