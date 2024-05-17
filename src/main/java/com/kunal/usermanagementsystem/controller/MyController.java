package com.kunal.usermanagementsystem.controller;

import org.springframework.web.bind.annotation.RestController;

import com.kunal.usermanagementsystem.entity.User;
import com.kunal.usermanagementsystem.services.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MyController {

    @Autowired
    UserServices userServices;

    @PostMapping(value = "addUser")
    public String addNewUser(@RequestBody User newUser) {
        return userServices.addNewUser(newUser);
    }

    @GetMapping(value = "getUser")
    public List<User> getAllUser(){
        return userServices.getAllUser();
    }

    @GetMapping(value = "getUser/{id}")
    public User getSingleUser(@PathVariable int id){
        return userServices.getUserById(id);
    }

    @PutMapping(value = "updateUser/{id}")
    public String updateUser(@RequestBody User updatedUser, @PathVariable int id){
        return userServices.updateUser(updatedUser, id);
    }

    @DeleteMapping(value = "deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userServices.deleteUser(id);
    }
    

}
