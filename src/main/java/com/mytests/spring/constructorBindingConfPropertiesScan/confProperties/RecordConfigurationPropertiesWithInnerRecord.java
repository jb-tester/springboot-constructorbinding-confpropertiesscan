package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * *
 * <p>Created by irina on 7/18/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * *
 */
@ConfigurationProperties("my.props10")
public record RecordConfigurationPropertiesWithInnerRecord(SubRecord1 pr1, List<SubRecord2> pr2) {

    record SubRecord1(String pr1, String pr2){}
    record SubRecord2(String pr3, List<SubSubRecord21> pr4, List<SubSubRecord22> pr5){


        record SubSubRecord21(String pr6){}
        record SubSubRecord22(String pr7){}
    }
}
