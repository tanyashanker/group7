package com.capgemini.bechdalo.pojo;

public class userDetails {
String fullName, userName, email,password,address, phoneNumber,gender;

public userDetails(String fullName, String userName, String email, String password, String address, String phoneNumber,
		String gender) {
	super();
	this.fullName = fullName;
	this.userName = userName;
	this.email = email;
	this.password = password;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.gender = gender;
}



public userDetails() {
	
}



public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "userDetails [fullName=" + fullName + ", userName=" + userName + ", email=" + email + ", password="
			+ password + ", address=" + address + ", phoneNumber=" + phoneNumber + ", gender=" + gender + "]";
}



}
