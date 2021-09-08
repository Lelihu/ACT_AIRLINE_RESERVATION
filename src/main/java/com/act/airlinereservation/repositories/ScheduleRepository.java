package com.act.airlinereservation.repositories;

import com.act.airlinereservation.domains.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {}
