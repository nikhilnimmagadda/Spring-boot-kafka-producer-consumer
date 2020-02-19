package com.example.kafka.springbootkafkaproducer.model;

public class User {

    private String name;
    private String dept;
    private Long Salary;

    public User(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }
}
