package com.example.entities;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String calle;

    private String cp;

    private String ciudad;

    public Address() {

    }

   @OneToOne
   @JoinColumn(unique = true)
   private Address customer;


    public Address(Object o, String s, String s1, String madrid) {
    }
}

