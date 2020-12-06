package com.codingtest;

import java.util.Arrays;

public class User extends UserAdditionalData{
	
	String name;
	String email;
	String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", street=" + street + ", pincode="
				+ pincode + ", educationp=" + Arrays.toString(educationp) + ", address=" + Arrays.toString(address)
				+ "]";
	}



	

}
