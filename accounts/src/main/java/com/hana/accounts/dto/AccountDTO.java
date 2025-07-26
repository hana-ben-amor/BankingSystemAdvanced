package com.hana.accounts.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AccountDTO {
    private Long accountNumber;
    private String accountType;
    private String branchAddress;
}
