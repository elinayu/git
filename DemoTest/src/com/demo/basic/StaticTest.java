package com.demo.basic;

public class StaticTest {
	{
		System.out.println("主方法中的构造块");
	}

	static{
		System.out.println("主方法中的静态构造块");
	}
	public  static void main(String args[] ){
		System.out.println("主方法");
		Person per1=new Person();
		Person per2=new Person();
		Person per3=new Person();
		System.out.println(Person.getCount());
		//fun()  static静态方法不能调用非静态方法
		new Demo();
		new Demo();
		new Demo();
	}

	public void fun(){
		
	}
}




