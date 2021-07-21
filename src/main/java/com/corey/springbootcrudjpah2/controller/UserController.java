package com.corey.springbootcrudjpah2.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import com.corey.springbootcrudjpah2.entity.User;
import com.corey.springbootcrudjpah2.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user", produces = "application/json")
public class UserController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User responseUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);
    }

    @PostMapping("/addAllUsers")
    public List<User> addAllUsers(@RequestBody List<User> users) {
        return userService.createAllUsers(users);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        if(id == 0) throw new NoSuchElementException();
        return userService.getUserById(id);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/getAllUsersByCreateDate")
    public ResponseEntity<List<User>> getAllUsersByCreateDate(@RequestParam String start,@RequestParam String end) {
        try{
            return new ResponseEntity<>(userService.getAllUsersByCreateDate(sdf.parse(start), sdf.parse(end)), HttpStatus.OK);
        }catch(Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUserById(id);
    }

    @DeleteMapping("/deleteAllUsers")
    public String deleteAllUsers() {
        return userService.deleteAllUsers();
    }
}
