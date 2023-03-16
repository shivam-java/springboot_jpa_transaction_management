package com.springboot_jpa_transaction_management.dto;

import com.springboot_jpa_transaction_management.model.Customer;
import com.springboot_jpa_transaction_management.model.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

private Customer customer;
private Payment payment;

}
