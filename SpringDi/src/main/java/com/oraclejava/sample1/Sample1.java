package com.oraclejava.sample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sample1 {
	
	public static void main(String[] args) {
		//클래스패스에서 설정파일(sample1.xml)을 읽는다
		Resource resource = new ClassPathResource("sample1.xml");
		//리소스로부터 BeanFactory객체를 작성한다
		BeanFactory beanFactory = new XmlBeanFactory(resource); //sample1이용해 BeanFactory객체 생성
		//BeanFactory로부터 이름을 가진 객체를 얻는다
		Person hong = (Person)beanFactory.getBean("hong");
		
		System.out.println("hong info");
		System.out.println("id: " + hong.getId());
		System.out.println("name: " + hong.getName());
		System.out.println("age: " + hong.getAge());
	}

}
