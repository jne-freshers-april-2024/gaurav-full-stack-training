package com.thinkitive.thinkitiveempmanagementsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;

    @ManyToOne
    @JoinColumn(name = "fk_id")
    private Department dept;

    @ManyToOne
    @JoinColumn(name = "dg_fk_id")
    private Designation designation;

    public Emp() {
    }

    public Emp(int id, String firstName, String lastName, String email, LocalDate dob, Department dept, Designation designation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.dept = dept;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }
}
