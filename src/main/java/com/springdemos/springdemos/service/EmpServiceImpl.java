package com.springdemos.springdemos.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.springdemos.springdemos.dto.Emp;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;
import java.util.RandomAccess;

@Service
public class EmpServiceImpl implements EmpService {


    @Override
    public Emp getEmp(int emp) {
        return null;
    }

    @Override
    @HystrixCommand(fallbackMethod = "defaultGreeting")
    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    public Emp getEmpList() {
        String s = "8080";
        if (System.currentTimeMillis() % 2 == 1) {
            s = "9000";
        }
        String url = "http://localhost:" + s + "/emp/{id}";
        Integer empId = 101;
        RestTemplate restTemplate = new RestTemplate();
        Emp emp =
                restTemplate.getForObject(url, Emp.class, empId);
        return emp;
    }

    private Emp defaultGreeting() {
        return new Emp();
    }
}
