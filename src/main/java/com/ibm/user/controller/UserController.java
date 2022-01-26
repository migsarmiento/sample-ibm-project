package com.ibm.user.controller;

import com.ibm.user.TestClass;
import com.ibm.user.entity.User;
import com.ibm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) { this.userService = userService; }

    @GetMapping("/create-sample")
    public User hello() {
        return new User(1L, "username", "password", "firstName", "lastName");
    }

    @GetMapping("")
    public User getUser(@RequestParam String id) {
        //Another step to retrieve user
        return userService.get(id);
    }

    @PostMapping("/create")
    public User createUser() {
        TestClass testClass = new TestClass();
        return userService.createUser();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable String id) {

        return userService.update(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public User deleteUser(@PathVariable String id) {
        return userService.delete(id);
    }

}
