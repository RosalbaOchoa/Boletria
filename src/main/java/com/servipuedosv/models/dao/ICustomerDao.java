package com.servipuedosv.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.servipuedosv.models.entities.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long> {

}
