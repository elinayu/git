package com.demo.generic;

class Notepad<K,V> {
	private K key;
	private V var;
	
	public Notepad(K key, V var) {
		super();
		this.key = key;
		this.var = var;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVar() {
		return var;
	}
	public void setVar(V var) {
		this.var = var;
	}
	

}
