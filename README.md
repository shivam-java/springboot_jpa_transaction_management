# springboot_jpa_transaction_management

post query http://localhost:8080/customer/process

{
    "customer":{
        "customer_name":"lallu",
        "source":"gonda",
        "destination":"lucknow",
        "totalFare":3000.0
    },
    "payment":
    {
        "accountNo":"account1",
        "cardType":"debit"
    }
}
