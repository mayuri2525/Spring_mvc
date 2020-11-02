package com.hefshine.util;

public class AddressModel {
	
	private String city ;
	private String state;
	private String country;
	
	
	public AddressModel() {
		System.out.println("default constructor");
	}
	public AddressModel(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressModel [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void display()
	{
		System.out.println("Address "+city+" "+state+" "+country+" ");
		
	}
	
	
}