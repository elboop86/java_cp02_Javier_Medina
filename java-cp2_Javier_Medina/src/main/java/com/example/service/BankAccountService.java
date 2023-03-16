package com.example.service;

import com.example.entities.BankAccount;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BankAccountService {

    // crud


    List<BankAccount> findAll();

    Optional<BankAccount> findById(Long id);

    List<BankAccount> findAllByIdentificador(String identificador);
}
