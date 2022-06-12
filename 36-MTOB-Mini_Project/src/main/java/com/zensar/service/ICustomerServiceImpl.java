package com.zensar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.bean.Customer;
import com.zensar.repository.ICustomerRepository;

@Service
public class ICustomerServiceImpl implements ICustomerService  {
	
	private  ICustomerRepository customerRepository;
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}
	@Override
	public Customer addCustomer(Customer customer) {
		return null;
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		return null;
	}
	@Override
	public Customer DeleteCustomer(int Customerid) {
		return null;
	}
	@Override
	public Customer viewCustomer(int customerid) {
		return null;
	}
	@Override
	public List<Customer> viewAllCustomers() {
		return null;
	}
	
	
	

}
