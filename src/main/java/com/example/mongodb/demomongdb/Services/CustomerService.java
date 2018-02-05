package com.example.mongodb.demomongdb.Services;

import com.example.mongodb.demomongdb.Repos.CustomerRepository;
import com.example.mongodb.demomongdb.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository   customerRepository;

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void insert(Customer customer){

        customerRepository.save(customer);
    }
    public List<Customer> getAllCustomers(){
        Customer  customer=new Customer();
        customer.setFirstName("shaaban");
        customer.setId("323");
        customer.setLastName("altnany");
        insert(customer);
        return customerRepository.findAll();
    }
}
