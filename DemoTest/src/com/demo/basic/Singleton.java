package com.demo.basic;

public class Singleton {
    private static  Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}

	
    //���췽��˽�л�
	private Singleton(){
		
	}
	
	public void print(){
		System.out.println("this is a singleton");
	}
}
