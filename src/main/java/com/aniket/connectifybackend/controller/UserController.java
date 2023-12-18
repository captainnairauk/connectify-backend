package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.User;
import com.aniket.connectifybackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        User newUser = new User();
        newUser.setId(user.getId());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());

        User savedUser = userRepository.save(newUser);
        return savedUser;
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "aniket", "kaimal", "aniket.kaimal@gmail.com", "12345");
        User user2 = new User(2, "sofiya", "rao", "sofiya.rao@gmail.com", "12345");
        users.add(user1);
        users.add(user2);
        return users;
    }

    @GetMapping("/users/{userId}")
    public User getUsersById(@PathVariable("userId") Integer id){
        User user1 = new User(1, "aniket", "kaimal", "aniket.kaimal@gmail.com", "12345");
        user1.setId(id);
        return user1;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        User user1 = new User(1, "aniket", "kaimal", "aniket.kaimal@gmail.com", "12345");

        if(user.getFirstName() != null){
            user1.setFirstName(user.getFirstName());
        }

        if(user.getLastName() != null){
            user1.setLastName(user.getLastName());
        }

        if(user.getEmail() != null){
            user1.setEmail(user.getEmail());
        }

        return user1;
    }

    @DeleteMapping("users/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId){
        return "user deleted succesfully with id "+ userId;
    }
}
