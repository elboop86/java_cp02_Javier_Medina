package com.example.repository;

import com.example.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByNif(String nif);

    List<Customer> findAllByName(String name);

}
