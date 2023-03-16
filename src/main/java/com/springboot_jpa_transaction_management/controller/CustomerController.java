package com.springboot_jpa_transaction_management.controller;

import com.springboot_jpa_transaction_management.dto.CustomerRequest;
import com.springboot_jpa_transaction_management.dto.CustomerRequestConfirmation;
import com.springboot_jpa_transaction_management.model.Customer;
import com.springboot_jpa_transaction_management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController  {


    @Autowired
    private CustomerService customerService;
    @PostMapping("/customer/process")
    public CustomerRequestConfirmation CustomerOrderService(@RequestBody CustomerRequest customerRequest)
    {
        return customerService.customerRequestConfimation(customerRequest);
    }
}
