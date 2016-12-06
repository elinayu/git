package com.demo.basic;

class Person {
	String name;
	int  age;
	public String info="person";
	private static int count;
    public Person(){
		count++;
		System.out.println("person的构造方法");
	}
    
    public Person(String name){
    	this.name=name;
    }
    public Person(String name,int age){
    	this.name=name;
    	this.age=age;
    }
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Person.count = count;
	}

   public void fun(){
	   this.tell();
   }
	
	
	
	public void tell(){
		System.out.println("person类中的tell方法");
		//System.out.print(this.name+"的年龄是"+this.age+"\n");
	}

	public void printinfo(){
		System.out.println(this.info);
	}
}
