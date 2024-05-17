package com.kunal.usermanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.kunal.usermanagementsystem.entity.User;

@Repository
public class UserDAO {

    private List<User> userList;

    public UserDAO() {
        userList = new ArrayList<>();
    }

    public boolean Insertuser(User newUser) {
        userList.add(newUser);
        return true;

    }

    public List<User> getAllRecords() {
        return userList;
    }

    public User getUserById(int id) {
        User u = null;
        for(User user: userList){
            if(user.getUserId() == id){
                u = user;
                break;
            }
        }
        return u;
    }

    public void removeUser(User user) {
        userList.remove(user);
    }
}
