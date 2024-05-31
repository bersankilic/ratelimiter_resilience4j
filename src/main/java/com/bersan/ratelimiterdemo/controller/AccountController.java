package com.bersan.ratelimiterdemo.controller;

import com.bersan.ratelimiterdemo.service.AccountService;
import com.bersan.ratelimiterdemo.model.Account;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @GetMapping("/getAllAccount")
    @RateLimiter(name = "bersan")
    public ResponseEntity<List<Account>> getAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }

}
