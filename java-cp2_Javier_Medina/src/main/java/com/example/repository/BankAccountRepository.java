package com.example.repository;

import com.example.entities.BankAccount;
import com.example.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
    List<BankAccount> findAllByIdentificador(String identificador);

    List<BankAccount> findAllBySaldo(Integer saldo);

    List<BankAccount> findAllByTipo(String tipo);

    List<BankAccount> findAllByCoste(Integer coste);

    List<BankAccount> findAllByInteres(Integer interes);

    List<BankAccount> findAllByData(LocalDate data);

    List<BankAccount> findAllByCustomer(Customer customer);
}
