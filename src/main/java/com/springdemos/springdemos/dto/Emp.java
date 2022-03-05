package com.springdemos.springdemos.dto;

import java.util.Objects;

public class Emp {

    private Integer id;
    private String name;
    private String sex;
    private Address address;
    private long sal;
    private long joinYear;
    private long joinExp;
    private Dept dept;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return Objects.equals(getId(), emp.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public long getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(long joinYear) {
        this.joinYear = joinYear;
    }

    public long getJoinExp() {
        return joinExp;
    }

    public void setJoinExp(long joinExp) {
        this.joinExp = joinExp;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
