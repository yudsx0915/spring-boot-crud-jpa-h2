package com.corey.springbootcrudjpah2.service;

import java.util.List;

import com.corey.springbootcrudjpah2.dao.UserRepository;
import com.corey.springbootcrudjpah2.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> createAllUsers(List<User> users){
        return userRepository.saveAll(users);
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user){
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        if(oldUser != null){
            oldUser.setName(user.getName());
            oldUser.setAddress(user.getAddress());
            userRepository.save(oldUser);
        }else{
            return new User();
        }
        return oldUser;
    }

    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "User got deleted";
    }
}
