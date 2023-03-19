package com.example.service.impl;

import com.example.entities.Caja;
import com.example.repository.CajaRepository;
import com.example.service.CajaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class CajaServiceImpl implements CajaService {

    private final CajaRepository cajaRepo;


    @Override
    public List<Caja> findAll() {
        return cajaRepo.findAll();
    }

    @Override
    public Optional<Caja> findById(Long id) {
        return cajaRepo.findById(id);
    }
}
