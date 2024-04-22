package com.thinkitive.thinkitiveempmanagementsystem.repository;

import com.thinkitive.thinkitiveempmanagementsystem.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
}
