package com.demo.generic;

class Point<T> {
	private T var;

	public Point(T var) {
		super();
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	
   
}
