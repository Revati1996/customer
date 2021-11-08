package com.bank.team.e.customer.CustomerService.Dao;

import java.rmi.ServerException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bank.team.e.customer.CustomerService.Common.ServiceException;
import com.bank.team.e.customer.CustomerService.Model.CustomerConcernDetails;
import com.bank.team.e.customer.CustomerService.Model.CustomerConcernsRepository;
import com.bank.team.e.customer.CustomerService.Model.CustomerDetails;
import com.bank.team.e.customer.CustomerService.Model.CustomerDetailsRepository;
import com.bank.team.e.customer.CustomerService.Model.GenerateTicketRequestData;
import com.bank.team.e.customer.CustomerService.Model.RegisterCustomerRequestData;

@Repository
@PropertySource(value = "classpath:queries/CustomerDetailsQuery.properties", ignoreResourceNotFound = true)
public class CustomerConcernDetailsDaoImpl implements CustomerConcernDetailsDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Autowired
	CustomerConcernsRepository customerConcernsRepository;
	
	@Autowired
	CustomerDetailsRepository customerDetailsRespository;

	@Autowired
	private Environment env;

	@Override
	public List<CustomerConcernDetails> getCustomerConcerns(long cust_Id, long limit, long offset) throws ServiceException {

		String query = env.getProperty("getCustomerConcernByCustId");

		List<CustomerConcernDetails> list = jdbcTemplate.query(query, new Object[] { cust_Id, limit, offset },
				new BeanPropertyRowMapper<CustomerConcernDetails>(CustomerConcernDetails.class));

		if (list.isEmpty())
			return null;
		else
			return list;
	}

	@Override
	public List<CustomerConcernDetails> getTicketDetails(long cust_Id,String ticket_number,long limit, long offset) throws ServiceException {

		String query = env.getProperty("getTicketDetails");

		List<CustomerConcernDetails> list = jdbcTemplate.query(query, new Object[] { cust_Id,ticket_number ,limit, offset},
				new BeanPropertyRowMapper<CustomerConcernDetails>(CustomerConcernDetails.class));

		if (list.isEmpty())
			return null;
		else
			return list;
	}

	@Override
	public CustomerConcernDetails generateTicket(CustomerConcernDetails customerConcernDetails) throws ServerException {
		return customerConcernsRepository.save(customerConcernDetails);
	}

	@Override
	public List<CustomerDetails> getCustomerDtlsById(Long cust_Id) throws ServerException{
		String query = env.getProperty("getCustomerDtlsById");
	
		List<CustomerDetails> list = jdbcTemplate.query(query, new Object[] {cust_Id},
				new BeanPropertyRowMapper<CustomerDetails>(CustomerDetails.class));

		if (list.isEmpty())
			return null;
		else
			return list;
	}
	
	@Override
	public List<CustomerDetails> validateUser(String username,String password) throws ServerException{
		String query = env.getProperty("validateUserDetails");
	
		List<CustomerDetails> list = jdbcTemplate.query(query, new Object[] {username,password},
				new BeanPropertyRowMapper<CustomerDetails>(CustomerDetails.class));

		if (list.isEmpty())
			return null;
		else
			return list;
	}
	
	}	
	
	
