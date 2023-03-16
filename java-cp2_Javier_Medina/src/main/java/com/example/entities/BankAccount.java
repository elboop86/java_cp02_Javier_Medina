package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identificador;
    private Integer saldo;
    private String tipo;
    private Integer coste;
    private Integer interes;
    private LocalDate data;
    @OneToOne
    @JoinColumn(unique = true)
    private Customer customer;



    public BankAccount(Long id, String corriente, int saldo, String euro, int coste, int interes, String luisOsmaPerez, int i) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccount that)) return false;
        return getIdentificador() == that.getIdentificador() && getSaldo() == that.getSaldo() && getCoste() == that.getCoste() && getInteres() == that.getInteres() && Objects.equals(getId(), that.getId()) && Objects.equals(getTipo(), that.getTipo()) && Objects.equals(getCustomer(), that.getCustomer()) && Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIdentificador(), getSaldo(), getTipo(), getCoste(), getInteres(), getCustomer(), getData());
    }
}
