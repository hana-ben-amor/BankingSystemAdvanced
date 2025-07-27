package com.hana.accounts.services.impl;

import com.hana.accounts.dto.CustomerDTO;

public interface IAccountService {
    /**
     * params : customerDTO - customer details
     * **/
    public void createAccount(CustomerDTO customerDTO);

    /**
     * params : mobileNumber - mobile number of the customer
     * **/
    public CustomerDTO fetchAccount(String mobileNumber);

    /**
     * params : customerDTO - customer details
     * **/
    public boolean updateAccount(CustomerDTO customerDTO);

    /**
     * params : mobileNumber - mobile number of the customer
     * **/
    public boolean deleteAccount(String mobileNumber);
}
