package com.example.online.boking.Customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class CustomerService {

    public List<Customer> getCustomer(){

        return List.of(
                new Customer(
                        1L,
                        "TROJAN",
                        "trojan@gmail.com",
                        "tjm0203"
                )
        );

    }
}
