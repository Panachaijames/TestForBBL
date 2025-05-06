package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User
{

    private Long id;

    @NotBlank(message = "Name is Mandatory")
    private String name;

    @NotBlank(message = "Username is Mandatory")
    private String username;

    @NotBlank(message = "Email is Mandatory")
    @Email(message = "Email should be valid")
    private String email;

    private Address address;
    private String phone;
    private String website;
    private Company company;

}