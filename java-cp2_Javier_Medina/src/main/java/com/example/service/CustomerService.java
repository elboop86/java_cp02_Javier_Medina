package com.example.service;

import com.example.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {


    // crud


      List<Customer> findAll();


}

