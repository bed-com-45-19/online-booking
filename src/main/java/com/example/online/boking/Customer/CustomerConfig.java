package com.example.online.boking.Customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
            Customer Trojan = new Customer(
                    "Trojan",
                    "trojan@gmail.com",
                    "tjm0203"
            );

            Customer Annia = new Customer(
                    "Annia",
                    "annia@gmail.com",
                    "tjm0507"
            );

            repository.saveAll(
                    List.of(Trojan, Annia)
            );
        };
    }
}
