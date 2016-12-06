package com.demo.generic;

 interface Info2<T> {
   public T getVar();
}

 class infoimpl implements Info2<String>{

	@Override
	public String getVar() {
		// TODO Auto-generated method stub
		return null;
	}
	 
 }
 
 class infoImpl2<T> implements Info2<T>{

	@Override
	public T getVar() {
		// TODO Auto-generated method stub
		return null;
	}
	 
 }