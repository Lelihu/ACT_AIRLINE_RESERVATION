package com.act.airlinereservation.repositories;

import com.act.airlinereservation.domains.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CRUD - Create, Read, Update, Delete

// <Class name, Data type of the ID field>
@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {}
