package com.bersan.ratelimiterdemo.service;

import com.bersan.ratelimiterdemo.model.Account;
import com.bersan.ratelimiterdemo.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }
}
