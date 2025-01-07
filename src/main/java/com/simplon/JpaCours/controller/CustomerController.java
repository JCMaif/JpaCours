package com.simplon.JpaCours.controller;

import com.simplon.JpaCours.entity.Customer;
import com.simplon.JpaCours.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path="users")
    ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.findAll();
        if(customers.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        System.out.println(customers);
        return ResponseEntity.ok(customers);
    }

    @PostMapping("/users")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping(path = "user/{id}")
    Optional<Customer> getCustomerById(@PathVariable Long id) {
        return Optional.ofNullable(customerService.findById(id).orElseThrow(RuntimeException::new));
    }
}
