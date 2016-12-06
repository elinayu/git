package com.demo.String;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str1="hello";
		String str2=new String("hello");
		
		System.out.println("str1--str2 "+(str1==str2));//�Ƚϵ�ַ��
		System.out.println("str1--equals---str2 "+str1.equals(str2));
		
		int a1=1;
		int a2=1;
		System.out.println("a1--a2�ĵ�ַ "+ (a1==a2));//�Ƚϵ�ַ��
		
		//string��ķ�����ϰ��
		//1���ַ������ַ������ת��
		char a[]=str1.toCharArray();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		String str3=new String(a);
		System.out.println(str3);
		
		char a3=str1.charAt(3);
		System.out.println(str1+"�ĵ������ַ���"+a3);
		
	    String str4=new String(a,1,4);
	    System.out.println(str4);
		
		//2:�ֽ����ַ�����ת��
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
	    
	    //3 ȡ��һ���ַ����ĳ���
	    System.out.println("str1�ĳ���Ϊ��"+str1.length());
	    
	    
	    //4 ����һ��ָ�����ַ����Ƿ����
	    System.out.println("λ�ã�"+"hello world".indexOf("o"));
	    System.out.println("λ�ã�"+"hello world".indexOf("ll"));
	    System.out.println("λ�ã�"+"hello world".indexOf("ll",4));
	 
	    //5 ȥ�����ҿո�
	    System.out.println("ȥ���ո�"+" hello world ".trim());
	    
	    //6 �ַ�����ȡ
	    System.out.println("��ȡ�ַ���"+"hello world".substring(3, 8));
	    System.out.println("��ȡ�ַ���"+"hello world".substring(3));
	    
		//7 ����ָ�����ַ�������ַ���
	    System.out.println("����ַ���");
	    String str[]="hello world".split(" ");
	    for(String s:str){
	    	System.out.print(s+"\\");
	    }
	    		
	    System.out.println("\n����ַ���2");
	    String str7[]="hello world".split("o");
	    for(String s:str7){
	    	System.out.print(s+":");
	    }
	    
	    //8 �ַ����Ĵ�Сдת��
	    System.out.println("\n\nHello".toLowerCase());
	    System.out.println("Hello".toUpperCase());
	    
	    //9 �ж��Ƿ���ָ�����ַ�����ͷ���߽�β
	    System.out.println("Hello".startsWith("h"));
	    System.out.println("Hello".endsWith("llo"));
	    
	    //10 �����ִ�Сд�����ַ����Ƚ�
	    System.out.println("hello".equalsIgnoreCase("Hello"));
	    
	    //11 ��һ��ָ�����ַ���ת��Ϊ�������ַ���
	    System.out.println("hello".replace("l", "w"));
	    System.out.println("hello".replaceFirst("l", "w"));
	    
	    
	}
}
