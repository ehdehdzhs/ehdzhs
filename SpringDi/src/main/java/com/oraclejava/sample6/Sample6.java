package com.oraclejava.sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample6 {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("sample6.xml");
	      SampleMail mail = (SampleMail) context.getBean("SampleMail");
	  
	      mail.sendMail("ehdehdzh1@gmail.com", "damansa1@naver.com", "01/12과제 조신영", "조신영");
	   }
	}
	

