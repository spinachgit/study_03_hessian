package com.spinach.spring;

import java.lang.annotation.Annotation;
import java.net.MalformedURLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caucho.hessian.client.HessianProxyFactory;
import com.spinach.spring.dto.UserDTO;
import com.spinach.spring.service.UserService;

/**
 * 1. 讲述如何配置Hessian的服务器端(与Spring集成).
 * 2.  讲述客户端如何调用
	①   使用HessianProxyFactory  Hessian代理工厂直接调用
	②   使用HessianProxyFactoryBean Hessian代理工厂Bean来完成接口调用.
 * @author wanghuihui
 * @date:2015年11月26日 下午2:46:28
 */
public class SpringTest_HessianProxyFactory {
    public static void main(String[] args) {
    	//方式一：利用本地的BEAN进行调用
    	clientTest1();
    	//clientTest2();
    	/**
    	 *  方式二：利用服务器的bean调用
    	 *  测试发现：main找不到对应的BEAN，junit TEST可以找到  
    	 */
    	serverTest();
    }
    
    /**
     *  使用HessianProxyFactory  Hessian代理工厂直接调用
     * @author wanghuihui
     * @date:2015年11月26日 下午2:48:11
     */
	private static void clientTest1() {
		String url = "http://localhost:8080/hessian_server/remoting/userServiceHH";
	      HessianProxyFactory factory = new HessianProxyFactory();
	      try {
	          UserService userService = (UserService) factory.create(UserService.class, url);
	          Annotation [] annotation = userService.getClass().getAnnotations();
	          System.out.println(userService.loadUser(1));
	      } catch (MalformedURLException e) {
	          e.printStackTrace();
	      }
	}

	private static void clientTest2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/spring-client.xml");
        UserService userService = (UserService)context.getBean("clientUserService");    //拿到ID=clientUserService的bean
        UserDTO dto = userService.loadUser(1);
        System.out.print(dto);
	}
	
	/**
	 *  方式二：利用服务器的bean调用
	 *  测试发现：main找不到对应的BEAN，junit TEST可以找到  
	 */
	private static void serverTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/spring-client.xml");
        UserService userService = (UserService)context.getBean("userServiceRemote");    //拿到服务端userServiceRemote的bean
        UserDTO dto = userService.loadUser(1);
        System.out.print(dto);
	}

}
