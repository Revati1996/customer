package com.bank.team.e.customer.CustomerService.Service;

import java.rmi.ServerException;

import org.springframework.stereotype.Service;

import com.bank.team.e.customer.CustomerService.Common.ServiceException;
import com.bank.team.e.customer.CustomerService.Model.GenerateTicketRequestData;
import com.bank.team.e.customer.CustomerService.Model.RegisterCustomerRequestData;
import com.bank.team.e.customer.CustomerService.Model.Status;
@Service
public interface CustomerConcernDetailsService {

	public Status getCustomerConcerns(long cust_Id,long limit,long offset) throws ServiceException ;
	public Status getTicketDetails(long cust_Id,String ticket_Id, long limit, long offset) throws ServiceException ;
	public Status generateTicket(GenerateTicketRequestData generateTicketRequestData) throws ServerException;
	public Status getCustomerDtlsById(Long cust_id) throws ServerException;
	public Status validateUser(String username,String passowrd) throws ServerException;}
