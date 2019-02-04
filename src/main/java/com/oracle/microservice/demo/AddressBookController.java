package com.oracle.microservice.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AddressBookController {
    private AddressRepository repository;

    public AddressBookController(AddressRepository repo) {
        this.repository = repo;
    }

    @RequestMapping("/addresses")
    public Collection<Address> addresses(){
        return repository.findAll();
    }
}
