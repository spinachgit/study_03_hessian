package com.spinach.spring.service.impl;

import org.springframework.stereotype.Service;

import com.spinach.spring.dto.UserDTO;
import com.spinach.spring.service.UserService;


/**
 *  
 * @author wanghuihui
 * @date:2015年11月26日 上午10:07:14
 */
@Service(value="userServiceRemote")
public class UserServiceImpl implements UserService{
	@Override
	public UserDTO loadUser(int id) {
		 UserDTO userDTO = new UserDTO();
	        userDTO.setName("lepdou");
	        userDTO.setAge(22);
	        return userDTO;
	}
}
