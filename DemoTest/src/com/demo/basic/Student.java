package com.demo.basic;

public class Student extends Person {
	private String school;
	public String info="student";

	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Student(){
		System.out.println("student中的构造方法");
	}
//	public void fun(){
//		System.out.println(getName());
//		System.out.println(getAge());
//	}
	
	//方法的复写
	public void tell(){
		//super.tell();
		System.out.print("student类中的tell方法");
	}
	
	
}
