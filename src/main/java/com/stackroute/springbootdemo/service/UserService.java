package com.stackroute.springbootdemo.service;

import com.stackroute.springbootdemo.domain.User;

public interface UserService
{
    public User saveUser(User user);
    public User getUserById(int id);

}
