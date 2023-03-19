package com.example.controller;

import com.example.entities.Caja;
import com.example.service.BankAccountService;
import com.example.service.CajaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor

@Controller
public class CajaController {

    private final CajaService cajaService;
    private final BankAccountService bankAccountService;

    @GetMapping("cajas") // GET http://localhost:8080/cajas
    public String findAll(Model model) {
        List<Caja> cajas = cajaService.findAll();
        model.addAttribute("Cajas", cajas);
        return "caja/caja-list";
    }

    @GetMapping("cajas/{id}") // http://localhost:8080/Cajas/1
    public String findById(Model model, @PathVariable Long id) {
        Optional<Caja> cajaOpt = cajaService.findById(id);
        if (cajaOpt.isPresent())
            model.addAttribute("caja", cajaOpt.get());
        else
            model.addAttribute("error", "Caja not found");

        return "caja/caja-detail";
    }
}
