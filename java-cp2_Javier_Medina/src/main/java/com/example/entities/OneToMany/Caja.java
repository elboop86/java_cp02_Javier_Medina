package com.example.entities.OneToMany;

import com.example.entities.BankAccount;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@AllArgsConstructor
@Getter
@ToString
@Setter
@Builder
@Entity
public class Caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    @Column(unique = true)
    private String cif;

    @OneToMany
    @JoinTable(name = "caja_cuentas_bancarias")
    @ToString.Exclude // opcional
    private List<BankAccount> cards = new ArrayList<>();


    public Caja() {
    }

    public Caja(String caja1, String s) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caja caja)) return false;
        return getId().equals(caja.getId()) && getName().equals(caja.getName()) && getCif().equals(caja.getCif()) && getCards().equals(caja.getCards());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCif(), getCards());
    }
}
