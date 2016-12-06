package com.demo.generic;

import java.awt.print.Printable;

import javax.security.auth.kerberos.KerberosKey;

class Info<T extends Number>{
	private T xT;
	private T yT;
	public T getxT() {
		return xT;
	}
	public void setxT(T xT) {
		this.xT = xT;
	}
	public T getyT() {
		return yT;
	}
	public void setyT(T yT) {
		this.yT = yT;
	}
	
   public <K> void Print(K  key){
	   //参数类型为K，返回值为空
   }
   
   public<M extends Info2<T>> Info2<T> fun(M var){
	return var;
	   
   }
 
}
