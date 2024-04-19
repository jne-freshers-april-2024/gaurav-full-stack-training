package com.thinkitive.thinkitiveempmanagementsystem.service;

import com.thinkitive.thinkitiveempmanagementsystem.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface EmpService {
    public List<Emp> getEmpData();
    public Emp getEmpId(int id);
    public Emp createEmpData(Emp emp);
    public Emp updateEmpData(int id);
    public void deleteEmpData(int id);
}
