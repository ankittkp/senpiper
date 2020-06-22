package com.senpiper.demo.entities;
import javax.persistence.Embeddable;
import javax.persistence.Access;
import javax.persistence.AccessType;



@Access(value=AccessType.PROPERTY)
@Embeddable
public class Address {
	
	private String DetailedAddress;
	public String getDetailedAddress() {
		return DetailedAddress;
	}
	public void setDetailedAddress(String detailedAddress) {
		DetailedAddress = detailedAddress;
	}
	
	private String City;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	private String State;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	private String Pincode;
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
}
