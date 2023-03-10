package com.example.controller;

import com.example.entities.BankAccount;
import com.example.entities.Customer;
import com.example.service.BankAccountService;
import com.example.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class BankAccountController {

    private final BankAccountService bankAccountService;

    @GetMapping("/bankAccounts")
    public String findAll(Model model) {
        List<BankAccount> bankAccounts = bankAccountService.findAll();
        model.addAttribute("bankAccounts", bankAccounts);
        model.addAttribute("message", "Hola mundo");
        return "bankAccounts-list";
    }
}
