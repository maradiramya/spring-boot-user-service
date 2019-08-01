package com.stackroute.springbootdemo.controller;

import com.stackroute.springbootdemo.domain.User;
import com.stackroute.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController
{
   private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
@PostMapping("user")
    public ResponseEntity<?> savedUser(@RequestBody User user)
    {

    User savedUser=userService.saveUser(user);
    return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }
    @GetMapping("user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id)
    {
     User retrivedUser=userService.getUserById(id);
        return new ResponseEntity<>(retrivedUser, HttpStatus.OK);

    }
}
