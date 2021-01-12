package com.yt.repository;

import com.yt.pojo.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAllUser();
}