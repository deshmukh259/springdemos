package com.springdemos.springdemos;

import com.springdemos.springdemos.processor.SpringDemo;
import com.springdemos.springdemos.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableHystrix
public class SpringDemosApplication implements ApplicationRunner {

    @Autowired
    SpringDemo springDemo;

    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(SpringDemosApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello");
        springDemo.demo1();


       // System.exit(0);
    }

    @Bean
    public SpringDemo getSpringDemo() {
        return new SpringDemo();
    }

}
