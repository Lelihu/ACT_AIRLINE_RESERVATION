package com.act.airlinereservation.repositories;

import com.act.airlinereservation.domains.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {}
