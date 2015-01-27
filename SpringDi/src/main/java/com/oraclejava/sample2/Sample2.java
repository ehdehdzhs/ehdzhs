package com.oraclejava.sample2;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("sample2.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Person hong = (Person)beanFactory.getBean("hong");
		
		/*System.out.println("Hong info");
		System.out.println("id: " + hong.getId());
		System.out.println("name: " + hong.getName());
		System.out.println("age: " + hong.getAge());
		
		System.out.println("Hong's PC info");
		List<PC> hongPC = hong.getMyPC();
		for(int i=0;i<hongPC.size();i++) {
			PC pc = hongPC.get(i);
			System.out.println("name: " + pc.getName());
			System.out.println("데스크탑여부: " + (pc.isDesktop() ? "yes" : "no"));
		}*/
		
		List<String> color = hong.getMyColor();
		for(int i=0;i<color.size();i++) {
			System.out.println("color: " + color.get(i));
		}
	}

}
