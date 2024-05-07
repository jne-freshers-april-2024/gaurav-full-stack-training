package com.thinkitive.microseervice.userservice.service;

import com.thinkitive.microseervice.userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public User create(User user);
    public User getUser(int user_Id);
    public List<User> getAll();
}
