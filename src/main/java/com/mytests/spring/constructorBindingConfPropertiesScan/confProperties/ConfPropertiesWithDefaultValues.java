package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties(prefix = "my.props11")
public final class ConfPropertiesWithDefaultValues {

    private static final String DEFAULT = "default_proptwo_value";

    private final String propertyOne;
    private final String propertyTwo;

    private ConfPropertiesWithDefaultValues(
            @DefaultValue("default_propone_value") String propertyOne,
            @DefaultValue(DEFAULT) String propertyTwo) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
    }
}