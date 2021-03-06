package com.nixmash.shiro.db;

import com.nixmash.shiro.models.Role;
import com.nixmash.shiro.models.User;

import java.util.List;

public interface UsersDb {

    User addUser(User user);
    User getUser(String username);

    List<Role> getRoles(Long userId);
}
