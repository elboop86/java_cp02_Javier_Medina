package com.example.service;

import com.example.entities.BankAccount;
import com.example.repository.BankAccountRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@AllArgsConstructor
@Service
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    @Override
    public List<BankAccount> findAll() {
        return bankAccountRepository.findAll();
    }




}