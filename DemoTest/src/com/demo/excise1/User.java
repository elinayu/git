package com.demo.excise1;

public class User {
  private String name;
  private String password;
private static int count=0;
  
public User() {
	super();
	count++;
}
public User(String name) {
	this();
	this.name = name;
	
}
public User(String name, String password) {
	this();
	this.name = name;
	this.password = password;


}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public static int getCount() {
	return count;
}

  
public void print(){
	System.out.println("ÐÕÃû£º"+this.name+"¿ÚÁî£º"+this.password);
}
}
