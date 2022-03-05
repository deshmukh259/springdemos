package com.springdemos.springdemos.config;

import com.springdemos.springdemos.service.EmpService;
import com.springdemos.springdemos.service.EmpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    public EmpService getEmp() {
        System.out.println("emp1");
        return new EmpServiceImpl();
    }

    @Bean
    @Primary
    public EmpService getEmp2() {
        System.out.println("emp2");
        return new EmpServiceImpl();
    }
}

