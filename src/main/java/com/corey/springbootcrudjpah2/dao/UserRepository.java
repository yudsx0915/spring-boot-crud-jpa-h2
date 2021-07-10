package com.corey.springbootcrudjpah2.dao;

import com.corey.springbootcrudjpah2.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
