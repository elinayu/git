package com.demo.generic;

public class Person<T extends Info3> {
   private T info3;

public Person(T info3) {
	super();
	this.setInfo3(info3);
}

public T getInfo3() {
	return info3;
}

public void setInfo3(T info3) {
	this.info3 = info3;
}
   public String toString(){
	   return this.info3.toString();
   }
	
}
