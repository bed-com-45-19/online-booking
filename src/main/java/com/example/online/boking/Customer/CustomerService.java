package com.example.online.boking.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers(){

      return customerRepository.findAll();

    }

    public void addNewCustomer(Customer customer) {
       Optional<Customer>customerOptional= customerRepository
               .findCustomerByEmail(customer.getEmail());
       if(customerOptional.isPresent()){
           throw new IllegalStateException("email taken");
       }
     customerRepository.save(customer);
    }
}
