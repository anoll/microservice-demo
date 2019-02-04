package com.oracle.microservice.demo;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Api(value="TO CHANGE", description="TO CHANGE")
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
