package com.example.service;

import com.example.entities.BankAccount;
import com.example.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankAccountService {

    // crud


    List<BankAccount> findAll();
}
