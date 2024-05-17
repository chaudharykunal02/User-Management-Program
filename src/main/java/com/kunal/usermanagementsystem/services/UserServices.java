package com.kunal.usermanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunal.usermanagementsystem.entity.User;
import com.kunal.usermanagementsystem.repository.UserDAO;

@Service
public class UserServices {

    @Autowired
    UserDAO userDAO;

    public String addNewUser(User newUser){
        boolean userStatus = userDAO.Insertuser(newUser);
        if(userStatus){
            return "User Insert Successfully !!";
        }else{
            return "Failed in user Insertion !!"; 
        }
    }

    public List<User> getAllUser() {
        return userDAO.getAllRecords();
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public String updateUser(User updatedUser, int id) {
        User user = getUserById(id);
        if (user != null) {
            user.setUserName(updatedUser.getUserName());
            user.setDateOfBirth(updatedUser.getDateOfBirth());
            user.setEmail(updatedUser.getEmail());
            user.setPhoneNo(updatedUser.getPhoneNo());
            user.setDate(updatedUser.getDate());
            user.setTime(updatedUser.getTime());
            return "User updated successfully !!!!";
        } else {
            return "User update failed !!!!";
        }
    }

    public String deleteUser(int id) {
        User user = getUserById(id);
        if(user != null){
            userDAO.removeUser(user);
            return "Deleted Successfully !!";
        }
        return "Detetion failed !!";
    }
}
