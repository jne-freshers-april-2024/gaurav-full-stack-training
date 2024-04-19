package com.thinkitive.thinkitiveempmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
//@Table(name = "dept_table")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;

    public Department(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
