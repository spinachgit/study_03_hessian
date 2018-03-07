package com.spinach.servlet;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.spinach.servlet.dto.ServletDto;
import com.spinach.servlet.service.ServletService;

/**
 *  hessian 的servlet实现。
 * @author wanghuihui
 * @date:2015年11月25日 上午10:28:06
 */
public class HessianServletTest {
	public static void main(String[] args) throws MalformedURLException {
		/**
		 *  在使用之前先确保服务端的接口是否是通的：
		 *  http://localhost:8080/hession_server 说明是挂在TOMCAT运行的。当然也可以是其它的
		 *  hession_server：服务端项目的名称
		 */
        String url = "http://localhost:8080/hessian_server/servlet";     
        HessianProxyFactory factory = new HessianProxyFactory();     
        ServletService hello = (ServletService) factory.create(ServletService.class, url);
        ServletDto dto = hello.loadUser(1);
        System.out.println(dto);
    }  
}
