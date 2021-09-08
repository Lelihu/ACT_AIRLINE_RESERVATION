package com.act.airlinereservation.services;

import com.act.airlinereservation.domains.Admin;
import com.act.airlinereservation.repositories.AdminRepository;
import com.act.airlinereservation.utils.DateCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin createAdmin(Admin admin) {

       return adminRepository.save(admin);

    }

    public Iterable<Admin> allAdmin() {
        return adminRepository.findAll();
    }
}
