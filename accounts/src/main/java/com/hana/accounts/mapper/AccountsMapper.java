package com.hana.accounts.mapper;
import com.hana.accounts.dto.AccountDTO;
import com.hana.accounts.entities.Account;
//this mapper class is used to map the account details to the account dto or vice versa
public class AccountsMapper {
    public static AccountDTO mapToAccountsDto(Account accounts, AccountDTO accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Account mapToAccounts(AccountDTO accountsDto, Account accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
