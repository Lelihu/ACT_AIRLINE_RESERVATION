package com.act.airlinereservation.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank(message = "Airline Name is Required.")
    @Column(nullable = false)
    public String Airline;

    @NotBlank(message = "Flight Name is Required.")
    @Column(nullable = false)
    public String FlightName;

    @NotBlank(message = "Flight Number is Required.")
    @Column(nullable = false)
    public String FlightNum;

    @NotBlank(message = "Origin is Required.")
    @Column(nullable = false)
    public String Origin;

    @NotBlank(message = "Origin Latitude is Required.")
    @Column(nullable = false)
    public String OriginLat;

    @NotNull(message = "Origin Longitude is Required.")
    @Column(nullable = false)
    public String OriginLong;

    @NotBlank(message = "Destination is Required.")
    @Column(nullable = false)
    public String Destination;

    @NotBlank(message = "Destination Latitude is Required.")
    @Column(nullable = false)
    public String DestinationLat;

    @NotBlank(message = "Destination Longitude is Required.")
    @Column(nullable = false)
    public String DestinationLong;

    @NotBlank(message = "Departure Time is Required.")
    @Column(nullable = false)
    public String DepartureTime;

    @NotBlank(message = "Arrival Time is Required.")
    @Column(nullable = false)
    public String ArrivalTime;

    @NotBlank(message = "Duration is Required.")
    @Column(nullable = false)
    public String Duration;

    @NotBlank(message = "Seat Class is Required.")
    @Column(nullable = false)
    public String SeatClass;

    @NotBlank(message = "Status is Required.")
    @Column(nullable = false)
    public String Status;

    @NotNull(message = "Available Seats is Required.")
    @Column(nullable = false)
    public Integer AvailableSeats;

    @NotNull(message = "Number of Seats is Required.")
    @Column(nullable = false)
    public Integer NumofSeats;

    public Double Price = 0.0;
}









