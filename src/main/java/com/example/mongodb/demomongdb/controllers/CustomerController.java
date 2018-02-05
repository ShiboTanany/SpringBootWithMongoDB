package com.example.mongodb.demomongdb.controllers;

import com.example.mongodb.demomongdb.Services.CustomerService;
import com.example.mongodb.demomongdb.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public CustomerService getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/customers",method = RequestMethod.GET)
    public List<Customer> getCustomerList(){
        return customerService.getAllCustomers();
    }
}
