package com.act.airlinereservation.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    private Long id;

    @NotNull(message = "Pin is mandatory.")
    @Column(nullable = false)
    private Integer ScheduleId;

    @NotNull(message = "Pin is mandatory.")
    @Column(nullable = false)
    private Integer CustomerId;

    @NotNull(message = "Pin is mandatory.")
    @Column(nullable = false)
    private Integer SeatNo;

    private Boolean isVerified = Boolean.TRUE;
}