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

    List<Customer> findAllByNif(String nif);

   List<Customer> findAllByName(String name);


    Customer save(Customer customer);


}

