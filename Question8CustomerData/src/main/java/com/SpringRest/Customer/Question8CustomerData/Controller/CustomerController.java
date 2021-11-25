package com.SpringRest.Customer.Question8CustomerData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.Customer.Question8CustomerData.Entity.Customer;
import com.SpringRest.Customer.Question8CustomerData.Service.CustomerService;

@RestController
public class CustomerController
{
	@Autowired
	private CustomerService  customerService;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return this.customerService.getCustomers();
		
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable String customerId)
	{
		return this.customerService.getCustomer(Long.parseLong(customerId));
		
	}
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return this.customerService.addCustomer(customer);
		
	}
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return this.customerService.updateCustomer(customer);
		
	}
	@DeleteMapping("/customers/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String customer)
	{
		try
		{
			this.customerService.deleteCustomer(Long.parseLong(customer));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
