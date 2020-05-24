package com.maosud.springbootkafkaproducer.model;

public class User {
    private String name;
    private String dep;
    private Long salary;

    public User(String name, String dep, Long salary) {
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
