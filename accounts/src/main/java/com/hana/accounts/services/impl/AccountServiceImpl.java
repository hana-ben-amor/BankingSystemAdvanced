package com.hana.accounts.services.impl;

import com.hana.accounts.constants.AccountConstants;
import com.hana.accounts.dto.CustomerDTO;
import com.hana.accounts.entities.Account;
import com.hana.accounts.entities.Customer;
import com.hana.accounts.exceptions.CustomerAlreadyExistsException;
import com.hana.accounts.mapper.CustomerMapper;
import com.hana.accounts.repositories.AccountRepository;
import com.hana.accounts.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.mapToCustomer(customerDTO, new Customer());
        // we don't want the same phone number to e used by a lot of customers
        Optional<Customer> existingCustomer= customerRepository.findByMobileNumber(customerDTO.getMobileNumber());
        if (existingCustomer.isPresent())
        {
            throw new CustomerAlreadyExistsException("Customer already exists with mobile number " + customerDTO.getMobileNumber());
        }
        customer.setCreatedAt(LocalDateTime.now());
        customer.setCreatedBy("system");
        Customer savedCustomer = customerRepository.save(customer);
        accountRepository.save(createNewAccount(savedCustomer));
    }

    private Account createNewAccount(Customer savedCustomer) {
        Account account = new Account();
        account.setCustomerId(savedCustomer.getCustomerId());
        long randomAccNumber = 1000000000L + (long) (Math.random() * 9000000000L);
        account.setAccountNumber(randomAccNumber);
        account.setCreatedAt(LocalDateTime.now());
        account.setCreatedBy("system");
        account.setAccountType(AccountConstants.SAVINGS);
        account.setBranchAddress(AccountConstants.ADDRESS);
        return account;
    }
}
