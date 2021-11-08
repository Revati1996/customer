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
@Table(name = "customer_concerns")
@JsonInclude(Include.NON_NULL)
public class CustomerConcernDetails {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_number")
	private String ticket_number;
	
	@Column(name = "cust_id")
	private Long cust_id;
	
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private String phone_number;		
	
	
	@Column(name = "description")
	private String description;	
	
	
	@Column(name = "ticket_status")
	private String ticket_status;
	
	@Column(name ="create_date" )
	private Date create_date;

	@Column(name = "last_updated_date")
	private Date last_updated_date;

	public String getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
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

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTicket_status() {
		return ticket_status;
	}

	public void setTicket_status(String ticket_status) {
		this.ticket_status = ticket_status;
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

	@Override
	public String toString() {
		return "CustomerConcernDetails [ticket_number=" + ticket_number + ", cust_id=" + cust_id + ", email=" + email
				+ ", phone_number=" + phone_number + ", description=" + description + ", ticket_status=" + ticket_status
				+ ", create_date=" + create_date + ", last_updated_date=" + last_updated_date + "]";
	}
	

}
