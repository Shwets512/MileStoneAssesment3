package com.Shweta.Service;

import java.util.List;

import com.Shweta.Entity.Customer;

public interface CustomerInterface {
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public List<Customer> findAllCustomers();
}
