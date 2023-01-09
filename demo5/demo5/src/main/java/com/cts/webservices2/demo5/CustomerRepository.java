package com.cts.webservices2.demo5;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	  List<Customer> findByLastName(String lastName);
	  Customer findById(long id);

}
