package com.tutorialspoint.demoJavaAnnotationBasedDI;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.tutorialspoint.demoCommon.Gospel1;

@Configurable
public class Gospel1Config {

    @Bean
    public Gospel1 gospel1() {
        System.out.println("Gospel1Config.java is getting called now.");
        return new Gospel1();
    }
}
