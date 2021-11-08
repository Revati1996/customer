package com.bank.team.e.customer.CustomerService.Model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "customer_master")
@JsonInclude(Include.NON_NULL)
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Long cust_id;	
	
	@Column(name = "cust_name")
	private String cust_name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phone_number;		
	
	@Column(name = "pan_number")
	private String pan_number;	
	
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "account_number")
	private Long account_number;	
	
	@Column(name = "account_type")
	private String account_type;	
	
	@Column(name = "account_balance")
	private Long account_balance;	
	
	@Column(name = "credit_score")
	private Long credit_score;	
	
	@Column(name ="create_date" )
	private Date create_date;

	@Column(name = "last_updated_date")
	private Date last_updated_date;
	
	
	@Column(name = "password")
	private String password;
	
	
	@Column(name = "username")
	private String username;
	
	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Long getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(Long account_balance) {
		this.account_balance = account_balance;
	}

	public Long getCredit_score() {
		return credit_score;
	}

	public void setCredit_score(Long credit_score) {
		this.credit_score = credit_score;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getLast_updated_date() {
		return last_updated_date;
	}

	public void setLast_updated_date(Date last_updated_date) {
		this.last_updated_date = last_updated_date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerDetails [cust_id=").append(cust_id).append(", cust_name=").append(cust_name)
				.append(", email=").append(email).append(", phone_number=").append(phone_number).append(", pan_number=")
				.append(pan_number).append(", address=").append(address).append(", account_number=")
				.append(account_number).append(", account_type=").append(account_type).append(", account_balance=")
				.append(account_balance).append(", credit_score=").append(credit_score).append(", create_date=")
				.append(create_date).append(", last_updated_date=").append(last_updated_date).append(", password=")
				.append(password).append(", username=").append(username).append("]");
		return builder.toString();
	}

	

	
}
