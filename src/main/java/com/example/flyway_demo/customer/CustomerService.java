package com.example.flyway_demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }

    public Customer updateCustomerName(Customer customer){
        Customer customerToUpdate = customerRepository.findById(customer.getCustomerId()).orElse(null);
        assert customerToUpdate != null;
        customerToUpdate.setCustomerName(customer.getCustomerName());
        return customerRepository.save(customerToUpdate);
    }
}
