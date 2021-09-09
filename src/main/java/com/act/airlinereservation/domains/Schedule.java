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

    @NotBlank(message = "Airline is mandatory.")
    @Column(nullable = false)
    @Size(max = 15, min = 3)
    private String Airline;

    @NotBlank(message = "Flight Name is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String FlightName;

    @NotBlank(message = "Flight Number is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String FlightNum;

    @NotBlank(message = "Origin is mandatory.")
    @Column(nullable = false, unique = true)
    private String Origin;

    @NotBlank(message = "OriginLat is mandatory.")
    @Column(nullable = false, unique = true)
    private String OriginLat;

    @NotNull(message = "OriginLong is mandatory.")
    @Column(nullable = false)
    private String OriginLong;

    @NotBlank(message = "Destination is mandatory.")
    @Column(nullable = false)
    @Size(max = 15, min = 3)
    private String Destination;

    @NotBlank(message = "DestinationLat is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String DestinationLat;

    @NotBlank(message = "DestinationLong is mandatory.")
    @Column(nullable = false)
    @Size(max = 15)
    private String DestinationLong;

    @NotBlank(message = "Departure Time is mandatory.")
    @Column(nullable = false, unique = true)
    private String DepartureTime;

    @NotBlank(message = "Arrival Time is mandatory.")
    @Column(nullable = false, unique = true)
    private String ArrivalTime;

    @NotNull(message = "Duration is mandatory.")
    @Column(nullable = false)
    private String Duration;

    @NotBlank(message = "Seat Class is mandatory.")
    @Column(nullable = false, unique = true)
    private String SClass;

    @NotNull(message = "Status is mandatory.")
    @Column(nullable = false)
    private String Status;

    @NotNull(message = "Available Seats is mandatory.")
    @Column(nullable = false)
    private Integer AvaSeats;

    @NotNull(message = "Number of Seats is mandatory.")
    @Column(nullable = false)
    private Integer NumSeat;

    private Boolean isVerified = Boolean.TRUE;

    private Double Price = 0.0;
}









