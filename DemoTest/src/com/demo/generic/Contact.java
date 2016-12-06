package com.demo.generic;

public class Contact implements Info3 {
   private String zipcode;
   private String telphone;
   private String address;
  public Contact(String zipcode, String telphone, String address) {
	super();
	this.zipcode = zipcode;
	this.telphone = telphone;
	this.address = address;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public String getTelphone() {
	return telphone;
}
public void setTelphone(String telphone) {
	this.telphone = telphone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
   public String toString(){
	return "联系方式：\n"+ 
       "\t|-联系电话:"+this.telphone+"\n"+
       "\t|-联系地址:"+this.address+"\n"+
       "\t|-邮政编码:"+this.zipcode+"\n";
	   
   }
}
