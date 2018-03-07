package com.spinach.servlet.service;

import com.spinach.servlet.dto.ServletDto;

/**
 * Created by lepdou on 14-12-19.
 */
public class ServletServiceImpl implements ServletService{
	@Override
	public ServletDto loadUser(int age) {
		 ServletDto userDTO = new ServletDto();
	        userDTO.setName("spinach");
	        userDTO.setAge(age);
	        userDTO.setValue("我是hessian的servlet实现!");
	        return userDTO;
	}
}
