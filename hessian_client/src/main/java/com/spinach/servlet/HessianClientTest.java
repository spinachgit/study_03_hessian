package com.spinach.servlet;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.caucho.hessian.client.HessianProxyFactory;
import com.spinach.servlet.dto.MyCar;
import com.spinach.servlet.service.HelloHessian;

/**
 *  hessian 的servlet实现。
 * @author wanghuihui
 * @date:2015年11月25日 上午10:28:06
 */
public class HessianClientTest {
	public static void main(String[] args) {
		/**
		 *  在使用之前先确保服务端的接口是否是通的：
		 *  http://localhost:8080/hession_server 说明是挂在TOMCAT运行的。当然也可以是其它的
		 *  hession_server：服务端项目的名称
		 */
        String url = "http://localhost:8080/hessian_server/remoting";     
        HessianProxyFactory factory = new HessianProxyFactory();     
        try {     
            HelloHessian hello = (HelloHessian) factory.create(HelloHessian.class, url);     
            System.out.println(hello.sayHello());     
    
            MyCar car = hello.getMyCar();     
            System.out.println(car.toString());     
            Map<String,Object> map = hello.myBabays();
            System.out.print("mybabys : ");
            for (Map.Entry entry :map.entrySet()) {     
                System.out.print(entry.getKey() + " " + entry.getValue()+"    ");     
            }
            System.out.print("\nFruits:");
            List<Object> fruits = hello.myLoveFruit();
            for (Object str : fruits) {     
                System.out.print(str+" ");     
            }  
            System.out.println();
            Map babies = hello.myBabays();
            //Map.Entry entryset = (Entry) babies.entrySet();
            Iterator it = babies.entrySet().iterator();
            while(it.hasNext()){
            	Entry entry = (Entry)it.next();
            	System.out.print(entry.getKey() + " " + entry.getValue()+ "    ");
            }
    
        } catch (MalformedURLException e) {     
            e.printStackTrace();     
        }     
    
    }  
}
