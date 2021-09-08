package com.act.airlinereservation.controllers;

import com.act.airlinereservation.domains.Schedule;
import com.act.airlinereservation.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    // For creating/inserting Passenger to the DB
    // call service class

    @PostMapping("/api/schedule/create")
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        return scheduleService.createSchedule(schedule);
    }

    // list all passengers
    @GetMapping("/api/schedule/list")
    public Iterable<Schedule> listSchedules() {
        return scheduleService.allSchedule();
    }
}
