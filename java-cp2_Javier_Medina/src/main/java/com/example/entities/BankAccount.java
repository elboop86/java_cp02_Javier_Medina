package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

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
    private int identificador;
    private int saldo;
    private String tipo;
    private int coste;
    private int interes;
    private String customer;
    private String data;

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
