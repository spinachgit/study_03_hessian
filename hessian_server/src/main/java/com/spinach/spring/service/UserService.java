package com.spinach.spring.service;

import com.spinach.spring.dto.UserDTO;

public interface UserService {

    UserDTO loadUser(int id);
}
