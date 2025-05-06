package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Company
{
    @NotBlank(message = "Name is Mandatory")
    private String name;
    private String catchPhrase;
    private String bs;
}