package com.stackroute.springbootdemo.service;

import com.stackroute.springbootdemo.domain.User;
import com.stackroute.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
   private UserRepository userRepository;
   @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl()
    {
    }

    @Override
    public User saveUser(User user) {
     User savedUser=  userRepository.save(user);
        return savedUser;
    }

    @Override
    public User getUserById(int id) {
       User retrivedUser= userRepository.findById(id).get();
       return retrivedUser;
    }
}
