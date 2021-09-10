package com.act.airlinereservation.services;

import com.act.airlinereservation.domains.Passenger;
import com.act.airlinereservation.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger createPassenger(Passenger passenger) {

            return passengerRepository.save(passenger);
    }

    public Iterable<Passenger> allPassengers() {

        return passengerRepository.findAll();
    }
}