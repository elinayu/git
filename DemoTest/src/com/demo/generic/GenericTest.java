package com.demo.generic;

public class GenericTest {

	public static void main(String[] args){
		Point<String> p1=new Point<String>("abc");
		Point<Float> p2=new Point<Float>(123.45f);
		fun1(p1);
		fun1(p2);
//		fun2(p1); 提示类型不合适
		fun2(p2);
		fun3(p1);
//		fun3(p2); 提示类型不合适d
		Notepad<String, Integer> notepad=new Notepad<String, Integer>("key", 12);
	}
	
	public static void fun(Point<String> p){
		System.out.println(p.getVar());

	}
	
	public static void funx(Point<Object> p){
		System.out.println(p.getVar());

	}
	//泛型方法
	public static <T> void funy(Point<T> p){
		
	}
	public static void fun1(Point<?> p){
		System.out.println(p.getVar());
	}
	
	public static void fun2(Point<? extends Number> p){
		System.out.println(p.getVar());
	}
	
	public static void fun3(Point<? super String> p){
		System.out.println(p.getVar());
	}
}
