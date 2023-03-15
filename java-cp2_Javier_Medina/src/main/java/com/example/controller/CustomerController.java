package com.example.controller;


import com.example.entities.Customer;
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
public class CustomerController {

private final CustomerService customerService;

    @GetMapping("/customers")
    public String findAll(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        model.addAttribute("message", "Hola mundo");
        return "customers/customer-list";
    }

    @GetMapping("/customers/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Customer> customerOpt = customerService.findById(id);

        if(customerOpt.isPresent()) {
            model.addAttribute("beer", customerOpt.get());
        } else {
            model.addAttribute("error", "404 Customer no encontrado");
        }
        return "customers/customer-list";
    }

    @GetMapping("customers/nif/{nif}")
    public String findByNif(Model model, @PathVariable String nif) {
        model.addAttribute("customers",customerService.findAllByNif(nif));
        return "customers/customer-list";

    }
// CREAR UN CUSTOMER
    @GetMapping("customers/create")
    public String createForm(Model model) {
        model.addAttribute("customer", new Customer()); // objeto vacío para rellenar desde el formulario
        model.addAttribute("customers", customerService.findAll());
        return "customers/customer-form";
    }
// EDITAR CUSTOMER
    @GetMapping("customers/{id}/edit")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Customer> customerOpt = customerService.findById(id);
        if (customerOpt.isPresent()) {
            model.addAttribute("customer", customerOpt.get());

        } else {
            model.addAttribute("error", "Cliente no encontrado");
        }

        return "customers/customer-form";
    }
}
