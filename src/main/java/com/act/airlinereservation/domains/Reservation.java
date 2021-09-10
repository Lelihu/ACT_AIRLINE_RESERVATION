package com.act.airlinereservation.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotNull(message = "Schedule Id is Required.")
    @Column(nullable = false)
    public Integer ScheduleId;

    @NotNull(message = "Customer Id is Required.")
    @Column(nullable = false)
    public Integer CustomerId;

    @NotNull(message = "Seat No is Required.")
    @Column(nullable = false)
    public Integer SeatNo;

    public Boolean isVerified = Boolean.TRUE;
}