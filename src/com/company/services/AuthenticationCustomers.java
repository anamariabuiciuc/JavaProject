package com.company.Services;

import com.company.Models.Customer;

public class AuthenticationCustomers {

    Customer customer;
    String password;

    AuthenticationCustomers(Customer customer, String password)
    {
        this.customer = customer;
        this.password = password;

    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return customer;
    }


}
