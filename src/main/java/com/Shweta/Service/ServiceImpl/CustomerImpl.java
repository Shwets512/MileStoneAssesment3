package com.Shweta.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shweta.Entity.Customer;
import com.Shweta.Service.CustomerInterface;
import com.Shweta.dao.CustRepository;
@Service
public class CustomerImpl implements CustomerInterface{
	
	@Autowired
	private CustRepository CustRepo;
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return CustRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return CustRepo.save(customer);
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customer>) CustRepo.findAll();
	}

}
