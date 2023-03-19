package com.example.service;

import com.example.entities.Caja;

import java.util.List;
import java.util.Optional;

public interface CajaService {
     List<Caja> findAll();


    Optional<Caja> findById(Long id);
}
