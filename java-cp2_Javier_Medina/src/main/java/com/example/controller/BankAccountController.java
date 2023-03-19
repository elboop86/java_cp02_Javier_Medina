package com.example.controller;

import com.example.entities.BankAccount;

import com.example.entities.Customer;
import com.example.service.BankAccountService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class BankAccountController {

    private final BankAccountService bankAccountService;

    @GetMapping("bankAccounts")
    public String findAll(Model model) {
        List<BankAccount> bankAccounts = bankAccountService.findAll();
        model.addAttribute("bankAccounts", bankAccounts);

        return "bankAccounts/bankAccount-list";
    }

    @GetMapping("bankAccounts/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<BankAccount> bankAccountOpt = bankAccountService.findById(id);

        if(bankAccountOpt.isPresent()) {
            model.addAttribute("bankAccount", bankAccountOpt.get());
        } else {
            model.addAttribute("error", "404 Cuenta no encontrada");
        }
        return "bankAccounts/bankAccount-detail";
    }

    @GetMapping("bankAccounts/identificador/{identificador}")
    public String findByIdentificador(Model model, @PathVariable String identificador) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByIdentificador(identificador));
        return "bankAccounts/bankAccount-list";

    }
    @GetMapping("bankAccounts/saldo/{saldo}")
    public String findBySaldo(Model model, @PathVariable Integer saldo) {
        model.addAttribute("bankAccounts",bankAccountService.findAllBySaldo(saldo));
        return "bankAccounts/bankAccount-list";

    }
    @GetMapping("bankAccounts/tipo/{tipo}")
    public String findByTipo(Model model, @PathVariable String tipo) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByTipo(tipo));
        return "bankAccounts/bankAccount-list";

    }
    @GetMapping("bankAccounts/coste/{coste}")
    public String findByCoste(Model model, @PathVariable Integer coste) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByCoste(coste));
        return "bankAccounts/bankAccount-list";

    }
    @GetMapping("bankAccounts/interes/{interes}")
    public String findByInteres(Model model, @PathVariable Integer interes) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByInteres(interes));
        return "bankAccounts/bankAccount-list";

    }

    @GetMapping("bankAccounts/data/{data}")
    public String findByData(Model model, @PathVariable LocalDate data) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByData(data));
        return "bankAccounts/bankAccount-list";

    }

    @GetMapping("bankAccounts/customer/{customer}")
    public String findByCustomer(Model model, @PathVariable Customer customer) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByCustomer(customer));
        return "bankAccounts/bankAccount-list";

    }
    // CREAR UNA CUENTA
    @GetMapping("bankAccounts/create")
    public String createForm(Model model) {
        model.addAttribute("bankAccounts", new BankAccount()); // objeto vacío para rellenar desde el formulario
        model.addAttribute("bankAccounts", bankAccountService.findAll());
        return "bankAccounts/bankAccount-form";
    }
    // EDITAR Cuenta
    @GetMapping("bankAccounts/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<BankAccount> bankAccountOpt = bankAccountService.findById(id);
        if (bankAccountOpt.isPresent()) {
            model.addAttribute("bankAccount", bankAccountOpt.get());

        } else {
            model.addAttribute("error", "Cuenta no encontrado");
        }

        return "bankAccounts/bankAccount-form";
    }
}
