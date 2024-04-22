package com.thinkitive.thinkitiveempmanagementsystem.controller;

import com.thinkitive.thinkitiveempmanagementsystem.entity.Emp;
import com.thinkitive.thinkitiveempmanagementsystem.serviceimpl.ServiceIpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmpController {

    @Autowired
    private ServiceIpl serviceIpl;

    @GetMapping("getempdata")
    public ResponseEntity<?> getEmpData() {
        List<Emp> empList = serviceIpl.getEmpData();
        return ResponseEntity.ok().body(createResponse("Success", "Employee data retrieved successfully", empList));
    }

    @GetMapping("getempdata/{id}")
    public ResponseEntity<?> getEmpId(@PathVariable int id) {
        Emp emp = serviceIpl.getEmpId(id);
        if (emp != null) {
            return ResponseEntity.ok().body(createResponse("Success", "Employee found", emp));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(createResponse("Error", "Employee not found with ID: " + id, null));
        }
    }

    @PostMapping("getempdata/create")
    public ResponseEntity<?> createEmpData(@RequestBody Emp emp) {
        Emp createdEmp = serviceIpl.createEmpData(emp);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(createResponse("Success", "Employee created successfully", createdEmp));
    }

    @PutMapping("getempdata/update/{id}")
    public ResponseEntity<?> updateEmpData(@PathVariable int id) {
        Emp updatedEmp = serviceIpl.updateEmpData(id);
        if (updatedEmp != null) {
            return ResponseEntity.ok().body(createResponse("Success", "Employee updated successfully", updatedEmp));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(createResponse("Error", "Employee not found with ID: " + id, null));
        }
    }

    @DeleteMapping("getempdata/delete/{id}")
    public ResponseEntity<?> deleteEmpData(@PathVariable int id) {
        serviceIpl.deleteEmpData(id);
        return ResponseEntity.ok().body(createResponse("Success", "Employee deleted successfully", null));
    }

    private Map<String, Object> createResponse(String status, String message, Object data) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", status);
        response.put("message", message);
        response.put("timestamp", LocalDateTime.now());
        response.put("data", data);
        return response;
    }
}
