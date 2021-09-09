package com.act.airlinereservation.services;

import com.act.airlinereservation.domains.Reservation;
import com.act.airlinereservation.repositories.ReservationRepository;
import com.act.airlinereservation.utils.DateCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(Reservation reservation) {

        return reservationRepository.save(reservation);

    }

    public Iterable<Reservation> allReservations() {
        return reservationRepository.findAll();
    }
}
