package com.hana.accounts.controllers;

import com.hana.accounts.constants.AccountConstants;
import com.hana.accounts.dto.AccountDTO;
import com.hana.accounts.dto.CustomerDTO;
import com.hana.accounts.dto.ResponseDTO;
import com.hana.accounts.entities.Account;
import com.hana.accounts.services.impl.AccountServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/accounts")
//returns of this controller are going to be JSON MediaType means application/json
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO)
    {
        accountService.createAccount(customerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDTO(AccountConstants.STATUS_201,AccountConstants.MESSAGE_201));

    }
}
