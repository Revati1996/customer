package com.bank.team.e.customer.CustomerService.Controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.team.e.customer.CustomerService.Common.ServiceException;
import com.bank.team.e.customer.CustomerService.Model.GenerateTicketRequestData;
import com.bank.team.e.customer.CustomerService.Model.Status;
import com.bank.team.e.customer.CustomerService.Service.CustomerConcernDetailsServiceImpl;

@RestController
@CrossOrigin
@RequestMapping(value = "/customer")
public class CustomerConcernDetailsController {
	
	CustomerConcernDetailsServiceImpl customerConcernDetailsService;

	
	
	
	
	/**
	 * @param customerConcernDetailsService
	 */
	public CustomerConcernDetailsController(CustomerConcernDetailsServiceImpl customerConcernDetailsService) {
		super();
		this.customerConcernDetailsService = customerConcernDetailsService;
	}

	@RequestMapping(value = "/{cust_id}/{limit}/{offset}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> getCustomerConcerns(@PathVariable("cust_id") Long cust_id,
			@PathVariable("limit") Long limit, @PathVariable("offset") Long offset)
			throws ServiceException, IOException {
		Status status = new Status();
		status = customerConcernDetailsService.getCustomerConcerns(cust_id, limit, offset);
		return new ResponseEntity<Status>(status, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/ticket/{cust_id}/{ticket_Id}/{limit}/{offset}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> getTicketDetails(@PathVariable("cust_id") Long cust_id,@PathVariable("ticket_Id") String ticket_Id,
			@PathVariable("limit") Long limit, @PathVariable("offset") Long offset)
			throws ServiceException, IOException {
		Status status = new Status();
		status = customerConcernDetailsService.getTicketDetails(cust_id,ticket_Id,limit, offset);
		return new ResponseEntity<Status>(status, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/ticket", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> generateTicket(@RequestBody GenerateTicketRequestData generateTicketRequestData)
			throws ServiceException, IOException {
		Status status = new Status();

		status = customerConcernDetailsService.generateTicket(generateTicketRequestData);

		return new ResponseEntity<Status>(status, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/{cust_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> getCustomerDtlsById(@PathVariable("cust_id") Long cust_id)
			throws ServiceException, IOException {
		Status status = new Status();
		status = customerConcernDetailsService.getCustomerDtlsById(cust_id);
		return new ResponseEntity<Status>(status, HttpStatus.OK);
	}
	
	
	// validate User
	
	@RequestMapping(value = "/validateUser/{username}/{password}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Status> validateUser(@PathVariable("username") String username,@PathVariable("password") String password)
			throws ServiceException, IOException {
		Status status = new Status();
		status = customerConcernDetailsService.validateUser(username,password);
		return new ResponseEntity<Status>(status, HttpStatus.OK);
	}
	
}
