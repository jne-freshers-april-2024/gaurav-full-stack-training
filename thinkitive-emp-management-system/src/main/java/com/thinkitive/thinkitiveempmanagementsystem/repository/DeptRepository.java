package com.thinkitive.thinkitiveempmanagementsystem.repository;


import com.thinkitive.thinkitiveempmanagementsystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Department, Integer> {
}