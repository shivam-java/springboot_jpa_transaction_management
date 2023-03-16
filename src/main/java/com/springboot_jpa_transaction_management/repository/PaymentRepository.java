package com.springboot_jpa_transaction_management.repository;

import com.springboot_jpa_transaction_management.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer>
{
}
