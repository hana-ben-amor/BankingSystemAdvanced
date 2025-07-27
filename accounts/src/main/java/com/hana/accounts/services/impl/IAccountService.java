package com.hana.accounts.services.impl;

import com.hana.accounts.dto.CustomerDTO;

public interface IAccountService {
    /**
     * params : customerDTO - customer details
     * **/
    public void createAccount(CustomerDTO customerDTO);
}
