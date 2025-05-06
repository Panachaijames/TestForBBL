package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address
{
    @NotBlank(message = "Street is Mandatory")
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

}