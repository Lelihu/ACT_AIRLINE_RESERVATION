package com.act.airlinereservation.services;

import com.act.airlinereservation.domains.Schedule;
import com.act.airlinereservation.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public Schedule createSchedule(Schedule schedule) {

            return scheduleRepository.save(schedule);
    }


    public Iterable<Schedule> allSchedules() {

        return scheduleRepository.findAll();
    }
}
