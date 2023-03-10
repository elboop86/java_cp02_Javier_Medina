package com.example.service;

import com.example.entities.Customer;
import com.example.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
