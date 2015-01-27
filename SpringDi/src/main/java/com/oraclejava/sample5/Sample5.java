package com.oraclejava.sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oraclejava.sample5.UserInfoBean;
public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("sample5.xml");
		UserInfoBean uBean = (UserInfoBean)appContext.getBean("userInfoBean");
		uBean.delUserInfo();

	}
	
}
