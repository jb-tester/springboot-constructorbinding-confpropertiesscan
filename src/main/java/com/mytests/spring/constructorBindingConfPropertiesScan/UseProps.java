package com.mytests.spring.constructorBindingConfPropertiesScan;

import com.mytests.spring.constructorBindingConfPropertiesScan.confProperties.*;
import com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir.ConfProperties3;
import com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir.ConfProperties5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * *
 */
@Service
public class UseProps {


    @Autowired
    private ConfProperties1 confProperties1;
    @Autowired
    private ConfProperties2 confProperties2;
    @Autowired
    private ConfProperties3 confProperties3;
    @Autowired
    private ConfProperties5 confProperties5;

  @Autowired
   private ConfProperties0 confProperties0;

    @Autowired
    private RecordConfigurationProperties recordConfigurationProperties;
    @Autowired
    private LombokConfProperties1 lombokConfProperties1;
@Autowired
    private LombokConfProperties2 lombokConfProperties2;
@Autowired
    private LombokConfProperties3 lombokConfProperties3;


    public void display(){
        System.out.println("ConfProperties1:");
        System.out.println(confProperties1.getProp1());
        System.out.println("ConfProperties2:");
        System.out.println(confProperties2.getProp1());
        System.out.println("ConfProperties3:");
        System.out.println(confProperties3.getProp1());
        System.out.println("ConfProperties5:");
        System.out.println(confProperties5.getProp1());
       System.out.println("ConfProperties0:");
       System.out.println(confProperties0.getProp1());
       System.out.println(confProperties0.getProp2());
        System.out.println("recordConfigurationProperties:");
        System.out.println(recordConfigurationProperties.prop1());
        System.out.println("lombokConfProperties1:");
        System.out.println(lombokConfProperties1.getProp1());
        System.out.println("lombokConfProperties2:");
        System.out.println(lombokConfProperties2.getProp1());
        System.out.println("lombokConfProperties3:");
        System.out.println(lombokConfProperties3.getProp1());
    }
}
