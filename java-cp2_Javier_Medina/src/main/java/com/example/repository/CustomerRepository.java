package com.example.repository;

import com.example.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {


    Object findAllByNif();
}
