package com.demo.String;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str1="hello";
		String str2=new String("hello");
		
		System.out.println("str1--str2 "+(str1==str2));//比较地址；
		System.out.println("str1--equals---str2 "+str1.equals(str2));
		
		int a1=1;
		int a2=1;
		System.out.println("a1--a2的地址 "+ (a1==a2));//比较地址；
		
		//string类的方法练习；
		//1：字符串与字符数组的转换
		char a[]=str1.toCharArray();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		String str3=new String(a);
		System.out.println(str3);
		
		char a3=str1.charAt(3);
		System.out.println(str1+"的第三个字符是"+a3);
		
	    String str4=new String(a,1,4);
	    System.out.println(str4);
		
		//2:字节与字符串的转换
	    byte b[]=str1.getBytes();
	    for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	    System.out.println("");
	    
	    byte b1[];
		try {
			b1 = str1.getBytes("utf-8");
			for(int i=0;i<b1.length;i++){
				System.out.print(b1[i]+" ");}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str5=new String(b);
		String str6=new String(b,1,3);
	    System.out.println("\nstr5:"+str5+"\n"+"str6:"+str6);
	    
	    //3 取得一个字符串的长度
	    System.out.println("str1的长度为："+str1.length());
	    
	    
	    //4 查找一个指定的字符串是否存在
	    System.out.println("位置："+"hello world".indexOf("o"));
	    System.out.println("位置："+"hello world".indexOf("ll"));
	    System.out.println("位置："+"hello world".indexOf("ll",4));
	 
	    //5 去掉左右空格
	    System.out.println("去掉空格"+" hello world ".trim());
	    
	    //6 字符串截取
	    System.out.println("截取字符串"+"hello world".substring(3, 8));
	    System.out.println("截取字符串"+"hello world".substring(3));
	    
		//7 按照指定的字符串拆分字符串
	    System.out.println("拆分字符串");
	    String str[]="hello world".split(" ");
	    for(String s:str){
	    	System.out.print(s+"\\");
	    }
	    		
	    System.out.println("\n拆分字符串2");
	    String str7[]="hello world".split("o");
	    for(String s:str7){
	    	System.out.print(s+":");
	    }
	    
	    //8 字符串的大小写转换
	    System.out.println("\n\nHello".toLowerCase());
	    System.out.println("Hello".toUpperCase());
	    
	    //9 判断是否以指定的字符串开头或者结尾
	    System.out.println("Hello".startsWith("h"));
	    System.out.println("Hello".endsWith("llo"));
	    
	    //10 不区分大小写进行字符串比较
	    System.out.println("hello".equalsIgnoreCase("Hello"));
	    
	    //11 将一个指定的字符串转换为其他的字符串
	    System.out.println("hello".replace("l", "w"));
	    System.out.println("hello".replaceFirst("l", "w"));
	    
	    
	}
}
