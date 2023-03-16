package com.example.service;

import com.example.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {


    // crud


      List<Customer> findAll();


    Optional<Customer> findById(Long id);

    Object findAllByNif(String nif);


    Customer save(Customer customer);
}

