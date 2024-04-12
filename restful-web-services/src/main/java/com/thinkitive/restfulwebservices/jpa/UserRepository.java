package com.thinkitive.restfulwebservices.jpa;

import com.thinkitive.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
