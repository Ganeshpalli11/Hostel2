package com.project.HarmonyHub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class users {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String username;
String email;
String password;
String gender;
String role;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser() {
	return username;
}
@Override
public String toString() {
	return "users [id=" + id + ", user=" + username + ", email=" + email + ", password=" + password + ", gender=" + gender
			+ ", role=" + role + ", address=" + address + "]";
}
public void setUser(String user) {
	this.username = user;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
String address;
public users() {
	super();
	// TODO Auto-generated constructor stub
}
public users(int id, String user, String email, String password, String gender, String role, String address) {
	super();
	this.id = id;
	this.username = user;
	this.email = email;
	this.password = password;
	this.gender = gender;
	this.role = role;
	this.address = address;
}

}
