package com.demo.generic;

public class GenericTest03 {
  public static void main(String[] args){
	  Person<Contact> per1=new Person<Contact>(new Contact("100020", "18513661760", "北京市朝阳区三里屯中宇大厦"));
	  Person<Information> per2=new Person<Information>(new Information("YUHONGLI", "FEMALE", 28));
	  System.out.println(per1.toString());
	  System.out.println(per2.toString());
  }
}
