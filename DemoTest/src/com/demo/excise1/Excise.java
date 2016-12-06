package com.demo.excise1;

public class Excise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		 Address addr=new Address("中国","北京","北京市","北京市三里屯","100000");
//		 addr.print();
//		 
		 String s="want you to know one thing";
//		 int a=s.indexOf("o");
//		 System.out.println(a);
//		int b=s.indexOf("o",a+1);
//		 System.out.println(b);
		
		
//		 System.out.println("次数："+find(s,'o'));
//		 System.out.println("次数："+find(s,'n'));
		 
//		 User u1=new User("yuhongli");
//		 User u2=new User("xutao","45156123");
//		 User u3=new User("guochao","48794566x");
//		 u1.setPassword("12345678");
//		 u1.print();
//		 u2.print();
//		 u3.print();
//		 
//		 System.out.println("用户个数为："+ User.getCount());
		 
//		 String s1="JAVA技术学习班 20070326";
//		 String s2="MLDN JAVA";
//		 String s3="JAVA技术学习班 20070326 MLDN 老师";
//		 System.out.println(s1.substring(s1.indexOf("2")));
//		 System.out.println(s2.replace("JAVA", "J2EE"));
//		 System.out.println(s1.substring(7, 8));
//		 System.out.println(s1.replace("0", ""));
//		 System.out.println(s3.replace(" ", ""));
		 
		 Book book[]=new Book[5];
		 for(int i=0;i<book.length;i++)
	      book[i]=new Book();
		 book[1].setName("新华词典");		 
		 book[2].setName("java");
		 for(int i=0;i<book.length;i++)
		  System.out.println(book[i].getNumber());
		 System.out.println(Book.getCount());
		 
	}
	
	public static int find(String s,char c){
		int count=0;
//		 while(s.indexOf(c)!=-1){
//			 s=s.substring(s.indexOf(c)+1);
//			 System.out.println(s);
//			 count++;
//		 }
		int i=0;
		while(i!=-1){
			
			i=s.indexOf(c,i+1);
			if(i!=-1){
			count++;}
		}
		return count;
	}

}
