package com.thinkitive.springbootjpadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ManageControl {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("get")
    public String user(Model m){
        List<User> user = userRepo.findAll();
        m.addAttribute("result", user);
        return "users list";
    }
}
