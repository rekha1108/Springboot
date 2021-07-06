package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "House_no")
	private int houseNo;
	
	@Column(name = "Street_name")
	String streetName;
	
	@Column(name ="City")
	String city;
	
	@Column(name ="State")
	String state;
	
	@Column(name = "Pincode")
	int pinCode;

	public Address(){

	}

	public Address(int houseNo, String streetName, String city, String state, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		city = city;
		state = state;
		this.pinCode = pinCode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", City=" + city + ", State=" + state
				+ ", pinCode=" + pinCode + ", getHouseNo()=" + getHouseNo() + ", getStreetName()=" + getStreetName()
				+ ", getCity()=" + getCity() + ", getState()=" + getState() + ", getPinCode()=" + getPinCode()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
}
