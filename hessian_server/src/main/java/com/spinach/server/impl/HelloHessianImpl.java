package com.spinach.server.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spinach.dto.MyCar;
import com.spinach.server.HelloHessian;

public class HelloHessianImpl  implements HelloHessian{

		public MyCar getMyCar() {     
	        MyCar car = new MyCar();     
	        car.setCarName("阿斯顿·马丁");     
	        car.setCarModel("One-77");     
	        return car;     
	    }     
	    
	    public Map<String, Object> myBabays() {     
	        Map<String,Object> map = new HashMap<String, Object>();     
	        map.put("son", "孙吴空");     
	        map.put("daughter", "孙小美"); 
	        map.put("son", "陈幂");  
	        return map;     
	    }     
	    
	    public List<Object> myLoveFruit() {     
	        List<Object> list = new ArrayList<Object>();     
	        list.add("apple");     
	        list.add("kiwi");     
	        list.add("orange");     
	        return list;     
	    }     
	    
	    public String sayHello() {     
	        return "welcom to Hessian";     
	    } 
}
