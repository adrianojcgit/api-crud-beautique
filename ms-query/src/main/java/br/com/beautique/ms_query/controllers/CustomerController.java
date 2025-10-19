package br.com.beautique.ms_query.controllers;

import br.com.beautique.ms_query.dtos.customers.CustomerDTO;
import br.com.beautique.ms_query.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    ResponseEntity<List<CustomerDTO>> listAllCustomer(){
        return ResponseEntity.ok(customerService.listAllCustomers());
    }
}
