package com.example.service.impl;

import com.example.entities.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;



    @Override
    public List<Customer> findAll() {
        log.info("findAll");   // Informativo por si da error

        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAllByNif(String nif) {
        return customerRepository.findAllByNif(nif);
    }

    @Override
    public List<Customer> findAllByName(String name) {
        return customerRepository.findAllByName(name);
    }

    @Override
    public Customer save(Customer customer) { return customerRepository.save(customer);

    }




}
