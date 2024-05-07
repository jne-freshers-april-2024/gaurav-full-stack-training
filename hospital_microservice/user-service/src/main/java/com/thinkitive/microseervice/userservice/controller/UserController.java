package com.thinkitive.microseervice.userservice.controller;

import com.thinkitive.microseervice.userservice.UserServiceApplication;
import com.thinkitive.microseervice.userservice.entity.User;
import com.thinkitive.microseervice.userservice.repository.UserRepository;
import com.thinkitive.microseervice.userservice.service.impl.UserServiceImplementation;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImplementation userServiceImplementation;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/{user_Id}")
//    @CircuitBreaker(name = "appointmnetBreaker", fallbackMethod = "appointmentFallback")
    @Retry(name = "appointmnetBreaker", fallbackMethod = "appointmentFallback")
    public ResponseEntity<User> getUserById(@PathVariable("user_Id") int user_Id) {
        User user = userServiceImplementation.getUser(user_Id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<User> appointmentFallback( int user_Id, Exception ex) {
        logger.info("Fallback is executed because service is down : ", ex.getMessage());

        ex.printStackTrace();

        User user =new User(11,"Devesh","Patil","devesh@gmail.com",23,"doctor");
        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/getall")
    public List<User> getAllUsers() {
        List<User> allUsers = userServiceImplementation.getAll();
        return allUsers;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        User createUser = userServiceImplementation.create(user);
        return createUser;
    }
}