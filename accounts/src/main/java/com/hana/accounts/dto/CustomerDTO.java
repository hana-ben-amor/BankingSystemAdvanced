package com.hana.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDTO {
    //it's also named POJO class which means Plain Old Java Object
    private String name;
    private String email;
    private String mobileNumber;
    private AccountDTO accountDTO;

    public AccountDTO getAccountDTO() {
        return accountDTO;
    }

    public void setAccountDTO(AccountDTO accountDTO) {
        this.accountDTO = accountDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
