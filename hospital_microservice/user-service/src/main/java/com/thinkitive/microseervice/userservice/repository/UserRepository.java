package com.thinkitive.microseervice.userservice.repository;

import com.thinkitive.microseervice.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
