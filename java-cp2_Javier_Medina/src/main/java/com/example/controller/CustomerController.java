package com.example.controller;


import com.example.entities.Customer;
import com.example.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@AllArgsConstructor
@Controller
public class CustomerController {

private final CustomerService customerService;

    @GetMapping("/Customers")
    public String findAll(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("Customers", customers);
        model.addAttribute("message", "Hola mundo");
        return "customer-list";
    }
}
