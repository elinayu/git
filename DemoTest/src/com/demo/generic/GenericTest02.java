package com.demo.generic;

public class GenericTest02 {
   public static void main(String[] args){
	
	  fun(123);
   }
   public static <S extends Number> void fun(S var){
		System.out.println(var);
	   
   }
   public static <K,V> void Print(K  key,V var){
	   //��������ΪK������ֵΪ��
   }
   
   public static <T extends Info2<T>> Info2<T> fun(T var){
	return var;
	   
   }
   
   //��������
   public static<T> void fun2(T  parms[]){
	   
   }
}
