package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;


@ConfigurationProperties(prefix = "my.props4")
public record RecordConfigurationProperties(String prop1,
                                            String prop2,
                                            @NestedConfigurationProperty UtilsRecord utilsRecord,
                                            List<UtilsRecord> recordsList) { }