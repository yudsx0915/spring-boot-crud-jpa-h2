package com.corey.springbootcrudjpah2.dao;

import java.util.Date;
import java.util.List;

import com.corey.springbootcrudjpah2.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByCreateDateBetween(Date start, Date end);
}
