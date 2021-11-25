package com.SpringRest.Customer.Question8CustomerData.Service;

import java.util.List;

import com.SpringRest.Customer.Question8CustomerData.Entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();


	public Customer getCustomer(long customerId);


	public Customer addCustomer(Customer customer);


	public Customer updateCustomer(Customer customer);


	public void deleteCustomer(long parseLong);

}
