package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "bankAccount")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer identificador;
    private String tipo;
    private Integer coste;
    private Integer interes;
    private String customer;
    private String moneda;
    private Data fecha;


    public BankAccount(Long id, int identificador, String credito, int coste, int interes, String emilioPerezSoto, String eur, int i) {
    }

    public void saveAll(List<BankAccount> ba1) {
    }
}
