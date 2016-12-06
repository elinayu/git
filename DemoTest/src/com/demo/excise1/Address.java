package com.demo.excise1;

public class Address {
   private String country;
   private String province;
   private String city;
   private String street;
   private String zipcode;
  
public Address(String country, String province, String city, String street, String zipcode) {
	super();
	this.country = country;
	this.province = province;
	this.city = city;
	this.street = street;
	this.zipcode = zipcode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
   
 public void print(){
	 System.out.println("国家"+this.country+"省份："+this.province+"城市："+this.city+"街道"+this.street+"邮编"+this.zipcode);
 }
}
