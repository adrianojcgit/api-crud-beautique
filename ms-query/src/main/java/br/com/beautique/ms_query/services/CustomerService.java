package br.com.beautique.ms_query.services;

import br.com.beautique.ms_query.dtos.customers.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> listAllCustomers();
    List<CustomerDTO> listByNameLikeIgnoreCase(String name);
    List<CustomerDTO> listByEmailLikeIgnoreCase(String email);
}
