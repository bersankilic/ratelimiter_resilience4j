package com.bersan.ratelimiterdemo.repository;

import com.bersan.ratelimiterdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
