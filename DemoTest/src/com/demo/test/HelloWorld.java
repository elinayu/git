package com.demo.test;

import java.lang.invoke.SwitchPoint;

import org.omg.CORBA.PUBLIC_MEMBER;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     System.out.println("hello world");
//     int result=1;
     /*for(int i=0;i<32;i++){
    	 result=result*2;  	
     }
     System.out.println(result);*/
     
     /*int max=Integer.MAX_VALUE;
     System.out.println("max="+max);
     System.out.println("max+1="+(max+1));
     //System.out.println("max="+max);
     System.out.println("long max="+((long)max+1));*/
     
     /*char ch1='c';
     char ch2=99;
     char ch3='a'+2;
     int i='c';
     System.out.println("ch1="+ch1);
     System.out.println("ch2="+ch2);
     System.out.println("ch3="+ch3);
     System.out.println("i="+i);*/
     
    /* System.out.println("d:\\selenium");
     System.out.println("\"hello world\"");
     System.out.println("\'\'");
     System.out.println("\"hello \n world\"");*/
     
    /* float f=3.223223f;
     System.out.println("f:"+f);
     
     boolean b=true;
     System.out.println("b:"+b);*/
     
     //int---->>float
     /*int x=10;
     int y=3;
     System.out.println(x/y);
     System.out.println(10/3);
     System.out.println(10/3.0);
     System.out.println((float)10/3);
    		 
     //int--->>string
     System.out.println("YUHONGLI"+222);
     System.out.println(1+2);
     System.out.println("1+2="+1+2);*/
     
    /* int x=10;
     int y=-19;
     System.out.println("x="+x+",-x="+-x);*/
     /*int x=10;
     int y=2;
     int max=x>y?x:y;
     System.out.println("max:"+max);
     
     String a="+";
     
     switch (a) {
	case "+":
		System.out.println("+");
		break;

	default:
		break;
	}
     
     */
    /* for(int i=0;i<10;i++){
    	 
    	 if(i==3){
    		 continue;
    	 }
    	 if (i==8) {
			break;
		}
    	 System.out.println("i="+i);*/
     
//     int score[]=null;
//     score=new int[12];
//     
//    // int[] score2=null;
//     int[] score3={1,2,3,4};
//     System.out.println(score.length);
//   //  System.out.println(score2.length);
//     System.out.println(score3.length);
//     
//     String score4[][]=new String[4][4];
//     for (int i=0;i<4;i++){
//    	 for(int j=0;j<4;j++){
//    		 score4[i][j]=i+"*"+j+"="+i*j;	
//    		 System.out.print(score4[i][j]+"\t");
//    	 }
//     System.out.print("\n");	} 
		
		
//     Person yuhongli=new Person();
//     yuhongli.name="yuhongli";
//     yuhongli.age=28;
//     yuhongli.tell();
		
	   Person yuhongli=new Person("yuhongli", 28);	    
	   Person hujing=new  Person("hujing",29);
	   yuhongli.age=30;
	   yuhongli.tell();
	   hujing.tell();
	    
	   int[] a={1,2,2,2,2};
	   for (int i : a) {
		   System.out.print(i+"、");
	}
         
     }
     

     
}
  
class demo{
	
	
}