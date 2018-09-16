package com.servipuedosv.models.services;

import java.util.List;

import com.servipuedosv.models.entities.Customer;

public interface ICustomerService {
	
	public List<Customer> findAll();
	
	public void save(Customer customer);
	
	public Customer findOne(Long CLI_NUM_DOCUMENTO);
	
	public void delete(Long CLI_NUM_DOCUMENTO);

}
