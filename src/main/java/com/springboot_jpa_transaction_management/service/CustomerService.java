package com.springboot_jpa_transaction_management.service;

import com.springboot_jpa_transaction_management.dto.CustomerRequest;
import com.springboot_jpa_transaction_management.dto.CustomerRequestConfirmation;
import com.springboot_jpa_transaction_management.model.Customer;
import com.springboot_jpa_transaction_management.model.Payment;
import com.springboot_jpa_transaction_management.repository.CustomerRepository;
import com.springboot_jpa_transaction_management.repository.PaymentRepository;
import com.springboot_jpa_transaction_management.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
@Service
public class CustomerService {


    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
public CustomerRequestConfirmation customerRequestConfimation(CustomerRequest customerRequest)
    {
        Customer customer = customerRequest.getCustomer();
        customer= customerRepository.save(customer);
        Payment payment = customerRequest.getPayment();
        PaymentUtils.validateAccountLimit(payment.getAccountNo(),customer.getTotalFare());
         payment.setCustomerID(String.valueOf(customer.getCustomer_id()));
         payment.setAmount(customer.getTotalFare());
        paymentRepository.save(payment);
        return new CustomerRequestConfirmation("SUCCESS",customer.getTotalFare(), UUID.randomUUID().toString(),customer);
    }
}
