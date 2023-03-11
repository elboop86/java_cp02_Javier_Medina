package com.example;


import com.example.entities.BankAccount;
import com.example.entities.Customer;

import com.example.entities.OneToMany.Caja;
import com.example.entities.OneToMany.CajaRepository;
import com.example.entities.OneToOne.Address;
import com.example.entities.OneToOne.AddressRepository;
import com.example.repository.BankAccountRepository;
import com.example.repository.CustomerRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.List;



@SpringBootApplication
public class App {

    static ApplicationContext context;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        oneToOne();
        oneToMany();
    }

    private static void oneToMany(BankAccount tarjeta1, BankAccount tarjeta2, BankAccount tarjeta3, BankAccount tarjeta4) {

        CajaRepository cajaRepo = context.getBean(CajaRepository.class);
        BankAccountRepository bankAccountRepo = context.getBean(BankAccountRepository.class);

        BankAccount ba1 = new BankAccount(null, "Corriente", 1560, "Euro", 20, 10, "Luis Osma Perez", 23/02/23);
        BankAccount ba2 = new BankAccount(null, "Credito", 3583, "Dolar", 20, 10, "Maria de la O", 10/06/20);
        BankAccount ba3 = new BankAccount(null, "Debito", 8952, "Rublo", 20, 10, "Juana de Arco",20/01/15);
        BankAccount ba4 = new BankAccount(null, "Corriente", 156230, "Yen", 20, 10, "Alfredo Perez Torres", 05/04/19);
        BankAccount ba5 = new BankAccount(null, "Credito", 560, "Euro", 20, 10, "Ken Follett", 02/04/19);

        bankAccountRepo.saveAll(List.of(ba1, ba2, ba3, ba4, ba5));

        Caja caja1 = new Caja("caja1", "123123385L");
        caja1.getCards().add(tarjeta1);
        caja1.getCards().add(tarjeta2);

        Caja caja2 = new Caja("caja2", "B32432543W");
        caja2.getCards().addAll(List.of(tarjeta3, tarjeta4));

        cajaRepo.saveAll(List.of(caja1, caja2));

    }

    private static void oneToOne() {

        CustomerRepository customerRepo = context.getBean(CustomerRepository.class);
        AddressRepository addressRepo = context.getBean(AddressRepository.class);

        var address1 = new Address(null, "Gran Via 19", "08080", "Madrid");
        var address2 = new Address(null, "Diagonal 235", "25369", "Barcelona");
        addressRepo.saveAll(List.of(address1, address2));


        Customer c1 = new Customer(null, "55566698P", "Emilio Perez Soto");
        Customer c2 = new Customer(null, "22111489R", "Julia Mata Pera");
        Customer c3 = new Customer(null, "55566698P", "Dolores Fuertes Barriga");
        Customer c4 = new Customer(null, "55566698P", "Armando Bronca Segura");
        Customer c5 = new Customer(null, "55566698P", "Aparicio De Lucia");

        customerRepo.saveAll(List.of(c1, c2, c3, c4, c5));

    }


    }