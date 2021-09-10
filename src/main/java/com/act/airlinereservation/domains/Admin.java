package com.act.airlinereservation.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank(message = "First Name is Required.")
    @Column(nullable = false)
    @Size(max = 15)
    public String firstName;

    @NotBlank(message = "Last Name is Required.")
    @Column(nullable = false)
    @Size(max = 15)
    public String lastName;


    @NotBlank(message = "Email is Required.")
    @Column(nullable = false, unique = true)
    public String email;

    @NotBlank(message = "Phone Number is Required.")
    @Column(nullable = false)
    public String phoneNumber;

    @NotBlank(message = "Password is Required.")
    @Column(nullable = false)
    public String password;
}