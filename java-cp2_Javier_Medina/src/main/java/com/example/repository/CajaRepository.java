package com.example.repository;

import com.example.entities.Caja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CajaRepository< ID> extends JpaRepository<Caja, ID> {
}