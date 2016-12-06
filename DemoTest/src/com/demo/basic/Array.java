package com.demo.basic;

public class Array {
	int temp[];
	int foot;
	
	public Array(int len){
		if(len>0){
		    this.temp=new int[len];}
		else 
			this.temp=new int[1];
		
	}
	
	public boolean add(int i){
		if(this.foot<this.temp.length){
		this.temp[foot]=i;
		this.foot++;
		return true;
		}
		else
			return false;
		
	}
	
	public int[] get(){
		return this.temp;
	}
}
