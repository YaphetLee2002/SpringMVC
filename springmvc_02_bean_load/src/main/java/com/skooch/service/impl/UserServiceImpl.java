package com.skooch.service.impl;

import com.skooch.domain.User;
import com.skooch.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    public void save(User user) {
        System.out.println("user service");
    }
}
