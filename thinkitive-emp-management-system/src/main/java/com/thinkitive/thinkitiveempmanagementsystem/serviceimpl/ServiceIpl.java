package com.thinkitive.thinkitiveempmanagementsystem.serviceimpl;

import com.thinkitive.thinkitiveempmanagementsystem.entity.Emp;
import com.thinkitive.thinkitiveempmanagementsystem.repository.EmpRepository;
import com.thinkitive.thinkitiveempmanagementsystem.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceIpl implements EmpService {

    @Autowired
    private EmpRepository empRepository;

    @Override
    public List<Emp> getEmpData() {
        List<Emp> list = empRepository.findAll();
        return list;
    }

    @Override
    public Emp getEmpId(int id) {
        Emp emp1 = empRepository.findById(id).get();
        return emp1;
    }

    @Override
    public Emp createEmpData(Emp emp) {
        Emp create = empRepository.save(emp);
        return create;
    }

    @Override
    public Emp updateEmpData(int id) {
        Emp updateEmp = empRepository.findById(id).get();
//        updateEmp.setFirstName("Darshan");
//        updateEmp.setLastName("Gadakh");
        Emp status = empRepository.save(updateEmp);
        return status;
    }

    @Override
    public void deleteEmpData(int id) {
        Emp deleteEmp = empRepository.findById(id).get();
        empRepository.delete(deleteEmp);
    }
}
