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
		System.out.println("student�еĹ��췽��");
	}
//	public void fun(){
//		System.out.println(getName());
//		System.out.println(getAge());
//	}
	
	//�����ĸ�д
	public void tell(){
		//super.tell();
		System.out.print("student���е�tell����");
	}
	
	
}
