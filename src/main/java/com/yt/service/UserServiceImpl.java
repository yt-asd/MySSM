package com.yt.service;

import com.yt.pojo.User;
import com.yt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAllUser() {
        return userRepository.findAllUser();
    }
}