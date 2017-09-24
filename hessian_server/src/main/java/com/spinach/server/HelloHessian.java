package com.spinach.server;

import java.util.List;
import java.util.Map;

import com.spinach.dto.MyCar;

public interface HelloHessian {
	String sayHello();
    
    MyCar getMyCar();     
    
    List<Object> myLoveFruit();     
    
    Map<String, Object> myBabays();     
}
