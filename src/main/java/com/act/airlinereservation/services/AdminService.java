package com.act.airlinereservation.services;

import com.act.airlinereservation.domains.Admin;
import com.act.airlinereservation.repositories.AdminRepository;
import com.act.airlinereservation.utils.DateCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AdminService {

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
    private AdminRepository adminRepository;

    public Admin createAdmin(Admin admin) {

        // validation
        return adminRepository.save(admin);

    }

    public Iterable<Admin> allAdmin() {
        return adminRepository.findAll();
    }
}
