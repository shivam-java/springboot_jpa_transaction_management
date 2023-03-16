package com.springboot_jpa_transaction_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootJpaTransactionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaTransactionManagementApplication.class, args);
	}

}
