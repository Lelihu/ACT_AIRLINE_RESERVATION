package com.act.airlinereservation.repositories;

import com.act.airlinereservation.domains.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CRUD - Create, Read, Update, Delete

// <Class name, Data type of the ID field>
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {}
