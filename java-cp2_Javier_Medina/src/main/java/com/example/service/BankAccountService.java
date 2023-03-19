package com.example.service;

import com.example.entities.BankAccount;

import com.example.entities.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public interface BankAccountService {

    // crud


    List<BankAccount> findAll();

    Optional<BankAccount> findById(Long id);

    List<BankAccount> findAllByIdentificador(String identificador);

    List<BankAccount> findAllBySaldo(Integer saldo);

    List<BankAccount> findAllByTipo(String tipo);

    List<BankAccount> findAllByCoste(Integer coste);

   List<BankAccount> findAllByInteres(Integer interes);

    List<BankAccount> findAllByData(LocalDate data);

    List<BankAccount> findAllByCustomer(Customer customer);

    BankAccount save(BankAccount bankAccount);

    void deleteById(Long id);
    void deleteAllById(List<Long> ids);
    void saveAll(List<BankAccount> bankAccount);
}
