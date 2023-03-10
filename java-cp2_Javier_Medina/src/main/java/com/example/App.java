package com.example;


import com.example.entities.Customer;

import com.example.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(App.class, args);




        CustomerRepository customerRepo = context.getBean(CustomerRepository.class);

        Customer c1 = new Customer(null,"55566698P","Emilio Perez Soto");
        Customer c2 = new Customer(null,"22111489R","Julia Mata Pera");
        Customer c3 = new Customer(null,"55566698P","Dolores Fuertes Barriga");
        Customer c4 = new Customer(null,"55566698P","Armando Bronca Segura");
        Customer c5 = new Customer(null,"55566698P","Aparicio De Lucia");

        customerRepo.saveAll(List.of(c1, c2, c3, c4, c5));
    }

}