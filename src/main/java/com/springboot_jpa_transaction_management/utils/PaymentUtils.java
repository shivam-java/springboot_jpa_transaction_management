package com.springboot_jpa_transaction_management.utils;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {


    private static Map<String,Double> paymentMap=new HashMap<>();
  static   {
        paymentMap.put("account1",10000.0);
        paymentMap.put("account2",2000.0);
        paymentMap.put("account3",8000.0);
        paymentMap.put("account4",7000.0);
    }

    public static boolean validateAccountLimit(String acc, Double amount)
    {
        Double limit_value = paymentMap.get(acc);
        if(amount>limit_value)
        {
            throw new RuntimeException("U have unsufficient balance");
        }
        return true;
    }
}
