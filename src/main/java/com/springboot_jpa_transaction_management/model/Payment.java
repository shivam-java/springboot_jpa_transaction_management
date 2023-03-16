package com.springboot_jpa_transaction_management.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Payment {

@Id
@GeneratedValue(generator = "uuid2")
@GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
private String paymentId;
private String accountNo;
private String cardType;
private double amount;
private  String customerID;

}
