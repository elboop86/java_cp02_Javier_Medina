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
         context = SpringApplication.run(App.class, args);
        oneToMany();
        oneToOne();
    }

        private static void oneToMany() {

            CajaRepository cajaRepo = context.getBean(CajaRepository.class);
            BankAccountRepository bankAccountRepo = context.getBean(BankAccountRepository.class);

            Caja caja1 = new Caja("caja1", "123123385L");
            Caja caja2 = new Caja("caja2", "B32432543W");

            cajaRepo.saveAll(List.of(caja1, caja2));


            BankAccount ba1 = new BankAccount(null, "Corriente", 1560, "Euro", 20, 10, "Emilio Perez Soto", 23 / 02 / 23);
            BankAccount ba2 = new BankAccount(null, "Credito", 3583, "Dolar", 20, 10, "Julia Mata Pera", 10 / 06 / 20);
            BankAccount ba3 = new BankAccount(null, "Debito", 8952, "Rublo", 20, 10, "Dolores Fuertes Barriga", 20 / 01 / 15);
            BankAccount ba4 = new BankAccount(null, "Corriente", 156230, "Yen", 20, 10, "Armando Bronca Segura", 05 / 04 / 19);
            BankAccount ba5 = new BankAccount(null, "Credito", 560, "Euro", 20, 10, "Aparicio De Lucia", 02 / 04 / 19);

            bankAccountRepo.saveAll(List.of(ba1, ba2, ba3, ba4, ba5));

        }


        private static void oneToOne() {

            CustomerRepository customerRepo = context.getBean(CustomerRepository.class);
            AddressRepository addressRepo = context.getBean(AddressRepository.class);

            Customer c1 = new Customer(null, "55566698P", "Emilio Perez Soto");
            Customer c2 = new Customer(null, "22111489R", "Julia Mata Pera");
            Customer c3 = new Customer(null, "55566698P", "Dolores Fuertes Barriga");
            Customer c4 = new Customer(null, "55566698P", "Armando Bronca Segura");
            Customer c5 = new Customer(null, "55566698P", "Aparicio De Lucia");

            customerRepo.saveAll(List.of(c1, c2, c3, c4, c5));

            var address1 = new Address(null, "Gran Via 19", "08080", "Madrid");
            var address2 = new Address(null, "Diagonal 235", "25369", "Barcelona");
            var address3 = new Address(null, "Calea 25", "34250", "Pamplona");
            var address4 = new Address(null, "Fallas 34", "89001", "Valencia");
            var address5 = new Address(null, "Triana 69", "47330", "Sevilla");
            addressRepo.saveAll(List.of(address1, address2, address3, address4, address5));

        }


    }
