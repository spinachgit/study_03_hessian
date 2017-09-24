package com.spinach.servlet.service;

import java.util.List;
import java.util.Map;

import com.spinach.servlet.dto.MyCar;


public interface HelloHessian {
	String sayHello();
    
    MyCar getMyCar();     
    
    List<Object> myLoveFruit();     
    
    Map<String, Object> myBabays();     
}
