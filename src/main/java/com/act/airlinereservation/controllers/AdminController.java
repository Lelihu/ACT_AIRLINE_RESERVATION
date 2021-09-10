package com.act.airlinereservation.controllers;

import com.act.airlinereservation.domains.Admin;
import com.act.airlinereservation.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/api/admin/create")
    public Admin createAdmin(@RequestBody Admin admin) {

        return adminService.createAdmin(admin);
    }

    @GetMapping("/api/admin/list")
    public Iterable<Admin> listAdmins() {

        return adminService.allAdmins();
    }
}
