package com.bank.team.e.customer.CustomerService.Dao;

import java.rmi.ServerException;
import java.util.List;

import com.bank.team.e.customer.CustomerService.Common.ServiceException;
import com.bank.team.e.customer.CustomerService.Model.CustomerConcernDetails;
import com.bank.team.e.customer.CustomerService.Model.CustomerDetails;

public interface CustomerConcernDetailsDao {
	public List<CustomerConcernDetails> getCustomerConcerns(long cust_Id,long limit,long offset) throws ServiceException;
	public List<CustomerConcernDetails> getTicketDetails(long cust_Id,String ticket_Id,long limit, long offset) throws ServiceException;
	public CustomerConcernDetails generateTicket(CustomerConcernDetails customerConcernDetails) throws ServerException;
	public List<CustomerDetails> getCustomerDtlsById(Long cust_Id) throws ServerException;
	public List<CustomerDetails> validateUser(String username,String password) throws ServerException;
}
