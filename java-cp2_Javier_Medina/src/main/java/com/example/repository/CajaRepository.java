package com.example.repository;

import com.example.entities.Caja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CajaRepository< ID> extends JpaRepository<Caja, ID> {
}