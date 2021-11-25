package com.SpringRest.Customer.Question8CustomerData.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.SpringRest.Customer.Question8CustomerData.Entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	
	
	List<Customer> list;
	
	public CustomerServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Customer(1,"ALex","India",7687678L));
		list.add(new Customer(2,"John","Canada",2453373l));
		list.add(new Customer(3,"Garry","Austin",1324897l));
		list.add(new Customer(4,"Rayn","Colorado",5667987l));
		list.add(new Customer(5,"Adam","NYC",7788788l));

		
	}
	
	
	@Override
	public List<Customer> getCustomers() {
		return list;
	}


	@Override
	public Customer getCustomer(long customerId) {
			
			Customer i=null;
			for (Customer customer : list) {
				if(customer.getId()==customerId)
				{
					i=customer;
					break;
				}
			}
			return i;
	}


	@Override
	public Customer addCustomer(Customer customer) {
		list.add(customer);	
		return customer;
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		
		list.forEach(e->{
			if(e.getId()==customer.getId())
			{
				e.setName(customer.getName());
				e.setAddress(customer.getAddress());
				e.setContactNo(customer.getContactNo());
			}
		});
		return customer;
	}


	@Override
	public void deleteCustomer(long parseLong) {
		
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}



}
