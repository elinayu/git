package com.demo.test;

class Person {
	String name;
	int  age;
    public Person(){
		
	}
    
	public Person(String name,int  age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	
	
	public void tell(){
		System.out.print(this.name+"的年龄是"+this.age+"\n");
	}

}
