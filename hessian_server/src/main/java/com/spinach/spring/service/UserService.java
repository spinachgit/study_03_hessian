package com.spinach.spring.service;

import com.spinach.spring.dto.UserDTO;

/**
 * Created by lepdou on 14-12-19.
 */
public interface UserService {

    UserDTO loadUser(int id);
}
