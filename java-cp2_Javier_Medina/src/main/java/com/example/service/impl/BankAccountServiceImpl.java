package com.example.service.impl;

import com.example.entities.BankAccount;
import com.example.entities.Customer;
import com.example.repository.BankAccountRepository;
import com.example.service.BankAccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @Override
    public Optional<BankAccount> findById(Long id) {
        return bankAccountRepository.findById(id);
    }

    @Override
    public List<BankAccount> findAllByIdentificador(String identificador) {
        return bankAccountRepository.findAllByIdentificador(identificador);
    }

    @Override
    public List<BankAccount> findAllBySaldo(Integer saldo) {
        return bankAccountRepository.findAllBySaldo(saldo);
    }

    @Override
    public List<BankAccount> findAllByTipo(String tipo) {
        return bankAccountRepository.findAllByTipo(tipo);
    }

    @Override
    public List<BankAccount> findAllByCoste(Integer coste) {
        return bankAccountRepository.findAllByCoste(coste);
    }

    @Override
    public List<BankAccount> findAllByInteres(Integer interes) {
        return bankAccountRepository.findAllByInteres(interes);
    }

    @Override
    public List<BankAccount> findAllByData(LocalDate data) {
        return bankAccountRepository.findAllByData(data);
    }

    @Override
    public List<BankAccount> findAllByCustomer(Customer customer) {
        return bankAccountRepository.findAllByCustomer(customer);
    }

    @Override
    public BankAccount save(BankAccount bankAccount) {
        return bankAccountRepository.save(bankAccount);
    }

    @Override
    public void deleteById(Long id) { bankAccountRepository.deleteById(id);

    }

    @Override
    public void deleteAllById(List<Long> ids) { bankAccountRepository.deleteAllById(ids);

    }

    @Override
    public void saveAll(List<BankAccount> bankAccount) { bankAccountRepository.saveAll(bankAccount);

    }
}
