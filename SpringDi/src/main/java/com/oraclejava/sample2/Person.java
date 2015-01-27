package com.oraclejava.sample2;

import java.util.List;

public class Person {
	private String id;
	private String name;
	private int age;
	//List : 순서가 있고 중복가능한 목록
	private List<PC> myPC;
	//좋아하는 색깔 목록
	private List<String> myColor;


	public List<String> getMyColor() {
		return myColor;
	}

	public void setMyColor(List<String> myColor) {
		this.myColor = myColor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<PC> getMyPC() {
		return myPC;
	}

	public void setMyPC(List<PC> myPC) {
		this.myPC = myPC;
	}
	
	

}
