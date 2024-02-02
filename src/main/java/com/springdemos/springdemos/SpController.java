package com.springdemos.springdemos;

import com.springdemos.springdemos.dto.Emp;
import com.springdemos.springdemos.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;

@RestController
public class SpController {

    @Autowired
    private EmpService empService;

    @GetMapping(value = "/emp/{empid}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Emp getEmp(@PathVariable("empid") int empid) {

        System.out.println("empid called");
        Emp emp = getEmp1(empid);
        return emp;
    }

    private Emp getEmp1(int empid) {
        Emp emp = new Emp();
        emp.setId(empid);
        emp.setName("Pu");
        return emp;
    }

    @GetMapping(value = "/emp/list",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Emp getEmpList() {
        System.out.println("/emp");
        return empService.getEmpList();
    }
}
