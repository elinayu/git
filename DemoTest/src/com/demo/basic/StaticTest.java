package com.demo.basic;

public class StaticTest {
	{
		System.out.println("�������еĹ����");
	}

	static{
		System.out.println("�������еľ�̬�����");
	}
	public  static void main(String args[] ){
		System.out.println("������");
		Person per1=new Person();
		Person per2=new Person();
		Person per3=new Person();
		System.out.println(Person.getCount());
		//fun()  static��̬�������ܵ��÷Ǿ�̬����
		new Demo();
		new Demo();
		new Demo();
	}

	public void fun(){
		
	}
}




