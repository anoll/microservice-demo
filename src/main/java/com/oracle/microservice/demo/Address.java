package com.oracle.microservice.demo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
public class Address {
    @Id @GeneratedValue
    private long id;
    private @NonNull String FirstName;
    private @NonNull String LastName;
    private @NonNull String Street;
    private @NonNull int StreetNumber;
}
