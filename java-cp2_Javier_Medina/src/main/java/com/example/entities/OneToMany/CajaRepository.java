package com.example.entities.OneToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CajaRepository< ID> extends JpaRepository<Caja, ID> {
}