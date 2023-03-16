package com.example.controller;

import com.example.entities.BankAccount;
import com.example.entities.Customer;
import com.example.service.BankAccountService;
import com.example.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class BankAccountController {

    private final BankAccountService bankAccountService;

    @GetMapping("/bankAccounts")
    public String findAll(Model model) {
        List<BankAccount> bankAccounts = bankAccountService.findAll();
        model.addAttribute("bankAccounts", bankAccounts);

        return "bankAccounts/bankAccount-list";
    }

    @GetMapping("/bankAccounts/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<BankAccount> bankAccountOpt = bankAccountService.findById(id);

        if(bankAccountOpt.isPresent()) {
            model.addAttribute("bankAccount", bankAccountOpt.get());
        } else {
            model.addAttribute("error", "404 Cuenta no encontrada");
        }
        return "bankAccounts/bankAccount-list";
    }

    @GetMapping("bankAccounts/identificador/{identificador}")
    public String findByIdentificador(Model model, @PathVariable String identificador) {
        model.addAttribute("bankAccounts",bankAccountService.findAllByIdentificador(identificador));
        return "bankAccounts/bankAccount-list";

    }
    // CREAR UNA CUENTA
    @GetMapping("bankAccounts/create")
    public String createForm(Model model) {
        model.addAttribute("bankAccount", new Customer()); // objeto vacío para rellenar desde el formulario
        model.addAttribute("bankAccounts", bankAccountService.findAll());
        return "bankAccounts/bankAccount-form";
    }
    // EDITAR Cuenta
    @GetMapping("bankAccounts/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<BankAccount> bankAccountOpt = bankAccountService.findById(id);
        if (bankAccountOpt.isPresent()) {
            model.addAttribute("bankAccounts", bankAccountOpt.get());

        } else {
            model.addAttribute("error", "Cuenta no encontrado");
        }

        return "bankAccounts/bankAccount-form";
    }
}
