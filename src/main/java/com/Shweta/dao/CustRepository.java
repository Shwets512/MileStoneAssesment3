package com.Shweta.dao;
import com.Shweta.Entity.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustRepository extends CrudRepository<Customer, Integer> {

}
