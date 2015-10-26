package com.tutorialspoint.demoJavaAnnotationBasedDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorialspoint.demoCommon.HelloWorld;

/**
 * This is to demo java-annotation-based Spring configuration/dependency
 * Injection.
 */

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        System.out.println("HelloWorldConfig.java is getting called now.");
        return new HelloWorld();
    }
}