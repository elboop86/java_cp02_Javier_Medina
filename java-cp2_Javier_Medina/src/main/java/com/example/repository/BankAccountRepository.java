package com.example.repository;

import com.example.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
    List<BankAccount> findAllByIdentificador(String identificador);
}
