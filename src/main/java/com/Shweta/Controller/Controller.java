package com.Shweta.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Shweta.Entity.Customer;
import com.Shweta.Service.ServiceImpl.CustomerImpl;


@RestController

@CrossOrigin("*")
public class Controller {
	@Autowired
	private CustomerImpl cust;
	@PostMapping(value="saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		System.out.println("Customer data is saved successfully");
		cust.saveCustomer(customer);
		return customer;
		}
	@GetMapping(value="getAllCustomers")
	public List<Customer> findAllCustomers() {
		return cust.findAllCustomers();
	}
	
	}
