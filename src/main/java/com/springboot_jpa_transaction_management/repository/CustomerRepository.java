package com.springboot_jpa_transaction_management.repository;

import com.springboot_jpa_transaction_management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>
{
}
