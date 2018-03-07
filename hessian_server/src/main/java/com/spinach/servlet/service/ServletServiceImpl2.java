package com.spinach.servlet.service;

import com.caucho.hessian.server.HessianServlet;
import com.spinach.servlet.dto.ServletDto;

/**
 * Created by lepdou on 14-12-19.
 */
public class ServletServiceImpl2 extends HessianServlet implements ServletService{
    @Override
    public ServletDto loadUser(int id) {
        ServletDto userDTO = new ServletDto();
        userDTO.setName("servlet");
        userDTO.setAge(22);
        userDTO.setValue("I am hessian servlet impl !");
        return userDTO;
    }
}
