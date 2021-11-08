package com.bank.team.e.customer.CustomerService.Model;

public class RegisterCustomerRequestData {
	String first_Name;
	String last_Name;	
	String email_Address;
	String password;
	
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail_Address() {
		return email_Address;
	}
	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RegisterCustomerRequestData [first_Name=" + first_Name + ", last_Name=" + last_Name + ", email_Address="
				+ email_Address + ", password=" + password + "]";
	}
	
}
