package com.codingtest;

import java.util.Arrays;

public class UserAdditionalData {

	public String street;
	public String pincode;
	public String educationp[];
	public String address[];
	
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String[] getEducationp() {
		return educationp;
	}
	public void setEducationp(String[] educationp) {
		this.educationp = educationp;
	}
	@Override
	public String toString() {
		return "UserAdditionalData [street=" + street + ", pincode=" + pincode + ", educationp="
				+ Arrays.toString(educationp) + ", address=" + Arrays.toString(address) + "]";
	}

	
}
