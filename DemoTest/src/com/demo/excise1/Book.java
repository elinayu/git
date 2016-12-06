package com.demo.excise1;

public class Book {
  private String name;
  private static int count;
  private String number;
  private float price;
  
public Book() {
	count++;
	this.number="book"+count;
}
public String getNumber() {
	return number;
}

public Book(String name, float price) {
	this();
	this.name = name;
	this.price = price;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static int getCount() {
	return count;
}

public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


  
}
