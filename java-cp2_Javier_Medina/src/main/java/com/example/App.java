package com.example;

import com.example.entities.BankAccount;
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

        var  bankAccountRepo = context.getBean(BankAccount.class);

        BankAccount ba1 = new BankAccount(null,569,"credito",25,3,"Emilio Perez Soto","EUR",25/02/23);
        BankAccount ba2 = new BankAccount(null,568,"debito",25,3,"Julia Mata Pera","DOL",20/01/20);
        BankAccount ba3 = new BankAccount(null,567,"credito",25,3,"Dolores Fuertes Barriga","YEN",12/01/19);
        BankAccount ba4 = new BankAccount(null,566,"debito",25,3,"Armando Bronca Segura","RUB",06/03/95);
        BankAccount ba5 = new BankAccount(null,565,"credito",25,3,"Aparicio De Lucia ","PST",01/02/21);

        bankAccountRepo.saveAll(List.of(ba1, ba2, ba3, ba4, ba5));

        var  customerRepo = context.getBean(CustomerRepository.class);

        Customer c1 = new Customer(null,"55566698P","Emilio Perez Soto");
        Customer c2 = new Customer(null,"22111489R","Julia Mata Pera");
        Customer c3 = new Customer(null,"55566698P","Dolores Fuertes Barriga");
        Customer c4 = new Customer(null,"55566698P","Armando Bronca Segura");
        Customer c5 = new Customer(null,"55566698P","Aparicio De Lucia");

        customerRepo.saveAll(List.of(c1, c2, c3, c4, c5));
    }

}