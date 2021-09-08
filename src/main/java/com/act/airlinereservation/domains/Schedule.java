package com.act.airlinereservation.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15, min = 3)
    private String Airline;

    @NotBlank(message = "Middle name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String FlightName;

    @NotBlank(message = "Last name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String FlightNum;

    @NotBlank(message = "Email is mandatory.")
    @Column(nullable = false, unique = true)
    private String Origin;

    @NotBlank(message = "Phone number is mandatory.")
    @Column(nullable = false, unique = true)
    private String OriginLat;

    @NotNull(message = "Date of birth is mandatory.")
    @Column(nullable = false)
    private String OriginLong;

    @NotBlank(message = "First name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15, min = 3)
    private String Destination;

    @NotBlank(message = "Middle name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String DestinationLat;

    @NotBlank(message = "Last name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String DestinationLong;

    @NotBlank(message = "Email is mandatory.")
    @Column(nullable = false, unique = true)
    private String DepartureTime;

    @NotBlank(message = "Phone number is mandatory.")
    @Column(nullable = false, unique = true)
    private String ArrivalTime;

    @NotNull(message = "Date of birth is mandatory.")
    @Column(nullable = false)
    private String Duration;

    @NotBlank(message = "Phone number is mandatory.")
    @Column(nullable = false, unique = true)
    private String SClass;

    @NotNull(message = "Date of birth is mandatory.")
    @Column(nullable = false)
    private String Status;

    @NotNull(message = "Pin is mandatory.")
    @Column(nullable = false)
    private Integer AvaSeats;

    @NotNull(message = "Pin is mandatory.")
    @Column(nullable = false)
    private Integer NumSeat;

    private Boolean isVerified = Boolean.TRUE;

    private Double Price = 0.0;
}









