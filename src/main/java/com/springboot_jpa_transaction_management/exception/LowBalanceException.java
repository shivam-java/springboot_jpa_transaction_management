package com.springboot_jpa_transaction_management.exception;

public class LowBalanceException extends RuntimeException
{
    public LowBalanceException(String msg)
    {
        super(msg);
    }
}
