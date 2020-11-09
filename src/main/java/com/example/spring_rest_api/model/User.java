package com.example.spring_rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

// model class determine the data structure in our program
@Getter     // automatic injection code for this class covers getters
@Setter     // automatic injection code for this class covers setters
@AllArgsConstructor // automatic generation of contructor with all fields in arguments
@NoArgsConstructor  // automatic generation of contructor without arguments
public class User {
    private int userId;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime registrationDateTime;
    private boolean status;


}
