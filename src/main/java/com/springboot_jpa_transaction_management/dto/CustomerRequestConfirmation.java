package com.springboot_jpa_transaction_management.dto;

import com.springboot_jpa_transaction_management.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestConfirmation {




    private String status;
    private double totalFare;
    private  String tokenId;
    private Customer customer;
}
