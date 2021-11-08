package com.bank.team.e.customer.CustomerService.Service;

import java.rmi.ServerException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.team.e.customer.CustomerService.Common.ResponseStatus;
import com.bank.team.e.customer.CustomerService.Common.ServiceException;
import com.bank.team.e.customer.CustomerService.Dao.CustomerConcernDetailsDao;
import com.bank.team.e.customer.CustomerService.Model.CustomerConcernDetails;
import com.bank.team.e.customer.CustomerService.Model.CustomerDetails;
import com.bank.team.e.customer.CustomerService.Model.GenerateTicketRequestData;
import com.bank.team.e.customer.CustomerService.Model.RegisterCustomerRequestData;
import com.bank.team.e.customer.CustomerService.Model.Status;

@Service
public class CustomerConcernDetailsServiceImpl implements CustomerConcernDetailsService, ResponseStatus {

	@Autowired
	CustomerConcernDetailsDao customerConcernDetailsDao;

	@Override
	public Status getCustomerConcerns(long cust_Id, long limit, long offset) throws ServiceException {

		Status status = new Status();

		List<CustomerConcernDetails> list = customerConcernDetailsDao.getCustomerConcerns(cust_Id, limit, offset);

		if (list != null) {
			status.setCode(SUCCESS);
			status.setMessage(DATA_FOUND);
			status.setData(list);
		}

		return status;
	}
	
	@Override
	public Status getTicketDetails(long cust_Id,String ticket_Id, long limit, long offset) throws ServiceException {

		Status status = new Status();

		List<CustomerConcernDetails> list = customerConcernDetailsDao.getTicketDetails(cust_Id,ticket_Id,limit,offset);

		if (list != null) {
			status.setCode(SUCCESS);
			status.setMessage(DATA_FOUND);
			status.setData(list);
		}

		return status;
	}

 @Override
	public Status generateTicket(GenerateTicketRequestData generateTicketRequestData) throws ServerException {
		Status status = new Status();
		Date dt = new Date();
		//String date = dt.toString();
		SimpleDateFormat sdt = new SimpleDateFormat("yyyyMMddHHMMSS");
		
		if (generateTicketRequestData != null) {
			String ticketNo = "TN" + sdt.format(dt) ;
			CustomerConcernDetails customerConcernDetails = new CustomerConcernDetails();			
			customerConcernDetails.setTicket_number(ticketNo);
			customerConcernDetails.setCust_id(generateTicketRequestData.getCust_id());;
			customerConcernDetails.setEmail(generateTicketRequestData.getEmail());
			customerConcernDetails.setPhone_number(generateTicketRequestData.getPhone_number());
			customerConcernDetails.setDescription(generateTicketRequestData.getDescription());	
			customerConcernDetails.setTicket_status("Open");
			customerConcernDetails.setCreate_date(new Date());
			customerConcernDetails.setLast_updated_date(new Date());	
			
			CustomerConcernDetails customerConcernDtls = customerConcernDetailsDao.generateTicket(customerConcernDetails);
			
			if (customerConcernDtls != null) {
				status.setCode(SUCCESS);
				status.setMessage(SUCCESS_MSG);
				status.setData(customerConcernDtls);
			}

		}
		return status;
	}
 @Override	public Status getCustomerDtlsById(Long cust_id) throws ServerException {
	 Status status = new Status();

		List<CustomerDetails> list = customerConcernDetailsDao.getCustomerDtlsById(cust_id);

		if (list != null) {
			status.setCode(SUCCESS);
			status.setMessage(DATA_FOUND);
			status.setData(list);
		}

		return status;
	}
 @Override
	public Status validateUser(String username,String password) throws ServerException {
		Status status = new Status();

		
		List<CustomerDetails> list = customerConcernDetailsDao.validateUser(username,password);
			if (list != null) {				
				status.setCode(SUCCESS);
				status.setMessage(SUCCESS_MSG);
				status.setData(list);
			}			
		return status;
	}

}
