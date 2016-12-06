package com.demo.basic;

public class Singleton {
    private static  Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}

	
    //构造方法私有化
	private Singleton(){
		
	}
	
	public void print(){
		System.out.println("this is a singleton");
	}
}
