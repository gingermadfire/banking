package com.gingermadfire.banking.repository;

import com.gingermadfire.banking.persistence.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRepository extends R2dbcRepository<User, Long> {
}
