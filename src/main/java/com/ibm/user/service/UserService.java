package com.ibm.user.service;

import com.ibm.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    /*public User createUser(String username, String password, String firstName, String lastName) {
        return new User(username, password, firstName, lastName);
    }*/

    //< Key, Value>

    // hashMap.get(K), returns Value
    // hashMap.put(K, V)
    private final HashMap<Long, User> hashMap = new HashMap<>();

    public void createUser(String username, String password, String firstName, String lastName) {
        //Replace with RANDOM ID GENERATOR:
        Long id = 10L; // REPLACE WITH RANDOM GENERATED VALUE
        User user = new User(id, username, password, firstName, lastName);
        hashMap.put(id, user);
    }

    public User getUser(Long id) {
        User user = hashMap.get(id);
        //return User
    }

    public User deleteUser(Long id) {
        hashMap.remove(id);
    }

    public User updateUser(Long id, User user) {
        //behavior to update user
        //TODO: UPDATE USER HERE
        User updatedUser = user;
        return updatedUser;
    }

}
