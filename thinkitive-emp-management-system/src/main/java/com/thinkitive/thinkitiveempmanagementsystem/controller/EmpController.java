package com.thinkitive.thinkitiveempmanagementsystem.controller;

import com.thinkitive.thinkitiveempmanagementsystem.entity.Emp;
import com.thinkitive.thinkitiveempmanagementsystem.repository.EmpRepository;
import com.thinkitive.thinkitiveempmanagementsystem.serviceimpl.ServiceIpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private ServiceIpl serviceIpl;
    @GetMapping("getempdata")
    public List<Emp> getEmpData(){
        return serviceIpl.getEmpData();
    }

    @GetMapping("getempdata/{id}")
    public Emp getEmpId(@PathVariable int id){
        return serviceIpl.getEmpId(id);
    }

    @PostMapping("getempdata/create")
    @ResponseStatus( code = HttpStatus.CREATED)
    public Emp createEmpData(@RequestBody Emp emp){
        return serviceIpl.createEmpData(emp);
    }

    @PutMapping("getempdata/update/{id}")
    public Emp updateEmpData(@PathVariable int id){
       return serviceIpl.updateEmpData(id);
    }

    @DeleteMapping("getempdata/delete/{id}")
    public void deleteEmpData(@PathVariable int id){
        serviceIpl.deleteEmpData(id);
    }
}