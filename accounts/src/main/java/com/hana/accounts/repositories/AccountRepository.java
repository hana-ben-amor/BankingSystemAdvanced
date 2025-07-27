package com.hana.accounts.repositories;

import com.hana.accounts.entities.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    public Optional<Account> findByCustomerId(Long customerId);

    @Transactional
    @Modifying
     // add these annotations whenever you want to update or delete data
    void deleteByCustomerId(Long customerId);
}
