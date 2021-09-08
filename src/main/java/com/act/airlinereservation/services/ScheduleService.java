package com.act.airlinereservation.services;

import com.act.airlinereservation.domains.Schedule;
import com.act.airlinereservation.repositories.ScheduleRepository;
import com.act.airlinereservation.utils.DateCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ScheduleService {

    // creates 2 instances/object
    //    Person a = new Person("Biniam");
    //    Person b = new Person("Abebe");

    /**
     * https://en.wikipedia.org/wiki/Singleton_pattern
     * In software engineering, the singleton pattern is a software design pattern that restricts the instantiation
     * of a class to one "single" instance.
     * This is useful when exactly one object is needed to coordinate actions across the system.
     */
    // only 1 object/instance is created and it is shared => Singleton pattern

    @Autowired
    private ScheduleRepository scheduleRepository;

    public Schedule createSchedule(Schedule schedule) {

        // validation

            return scheduleRepository.save(schedule);

    }

    public Iterable<Schedule> allSchedule() {
        return scheduleRepository.findAll();
    }
}
