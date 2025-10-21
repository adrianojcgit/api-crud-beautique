package br.com.beautique.ms_query.services.Impl;

import br.com.beautique.ms_query.dtos.customers.CustomerDTO;
import br.com.beautique.ms_query.repositories.CustomerRepository;
import br.com.beautique.ms_query.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> listAllCustomers() {
        try{
            return customerRepository.findAll();
        }catch(Exception e){
            throw new RuntimeException("Error listing all customer");
        }
    }

    @Override
    public List<CustomerDTO> listByNameLikeIgnoreCase(String name) {
        try{
            return customerRepository.findByNameLikeIgnoreCase(name);
        }catch(Exception e){
            throw new RuntimeException("Error listing all customer by name");
        }
    }

    @Override
    public List<CustomerDTO> listByEmailLikeIgnoreCase(String email) {
        try{
            return customerRepository.findByEmailLikeIgnoreCase(email);
        }catch(Exception e){
            throw new RuntimeException("Error listing all customer by email");
        }
    }
}
