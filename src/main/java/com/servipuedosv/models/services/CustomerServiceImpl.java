package com.servipuedosv.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.servipuedosv.models.dao.ICustomerDao;
import com.servipuedosv.models.entities.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Customer> findAll(){
		return (List<Customer>) customerDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Customer findOne(Long CLI_NUM_DOCUMENTO){
		return customerDao.findById(CLI_NUM_DOCUMENTO).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Customer customer) {
		customerDao.save(customer);
	}
	
	@Override
	@Transactional
	public void delete(Long CLI_NUM_DOCUMENTO) {
		customerDao.deleteById(CLI_NUM_DOCUMENTO);
	}
	
	

}
