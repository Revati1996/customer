package com.bank.team.e.customer.CustomerService.Model;

import java.util.Date;

import javax.persistence.Column;

public class GenerateTicketRequestData {
	private String ticket_number;	
	
	private Long cust_id;

	private String email;

	private String phone_number;		

	private String description;	

	private String ticket_status;

	private Date create_date;

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
		return "GenerateTicketRequestData [ticket_number=" + ticket_number + ", cust_id=" + cust_id + ", email=" + email
				+ ", phone_number=" + phone_number + ", description=" + description + ", ticket_status=" + ticket_status
				+ ", create_date=" + create_date + ", last_updated_date=" + last_updated_date + "]";
	}

	
	

	
}
