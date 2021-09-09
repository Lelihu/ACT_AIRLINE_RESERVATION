package com.act.airlinereservation.controllers;

import com.act.airlinereservation.domains.Passenger;
import com.act.airlinereservation.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/api/passenger/create")
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return passengerService.createPassenger(passenger);
    }

    @GetMapping("/api/passenger/list")
    public Iterable<Passenger> listPassengers() {
        return passengerService.allPassengers();
    }
}
