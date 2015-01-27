package com.oraclejava.sample4;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"sample4.xml", "sample4-1.xml"};
		ApplicationContext appContext = new ClassPathXmlApplicationContext(arr);
		/*Person hong = (Person)appContext.getBean("hong");
		System.out.println("Hong's info");
		System.out.println("id: " + hong.getId());
		System.out.println("name: " + hong.getName());
		System.out.println("age: " + hong.getAge());
		
		Person sylee = (Person)appContext.getBean("sylee");
		System.out.println("SeungChang's info");
		System.out.println("id: " + sylee.getId());
		System.out.println("name: " + sylee.getName());
		System.out.println("age: " + sylee.getAge());
		
		System.out.println("Message 출력");
		String message = appContext.getMessage("greeting", null, Locale.getDefault());
		//없는 메시지 처리
		String cry = appContext.getMessage("cry", null, "cry란 울다란 뜻", Locale.getDefault());
		System.out.println(message);
		System.out.println(cry);*/
		
		//에러 메시지 표시
		String error = appContext.getMessage("errors.required", new String[]{"이름"}, Locale.getDefault());
		System.out.println(error);
		
		String message_ja = appContext.getMessage("greeting", null, Locale.JAPAN);
		System.out.println(message_ja);
		
		String message_en = appContext.getMessage("greeting", null, Locale.ENGLISH);
		System.out.println(message_en);
		
		String message_ch = appContext.getMessage("greeting", null, Locale.CHINA);
		System.out.println(message_ch);
	}

}
