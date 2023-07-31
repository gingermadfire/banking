package com.gingermadfire.banking.repository;

import com.gingermadfire.banking.persistence.Account;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface AccountRepository extends R2dbcRepository<Account, Long> {
}
