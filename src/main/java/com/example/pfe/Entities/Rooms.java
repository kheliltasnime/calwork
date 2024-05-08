package com.example.pfe.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rooms")
@Builder
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String type;
    String location;
    String maintenance_status;
    Integer capacity;
    @Pattern(regexp = "^(Enabled|Disabled)$", message = "State must be either 'Enabled' or 'Disabled'")
    private String state = "Enabled";
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private String category="Rooms";
    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    @Pattern(regexp = "^(Reserved|Not yet)$", message = " Reservation State must be either 'Reserved' or 'Not yet'")
    private String Reservation_State = "Not yet";

    @Pattern(regexp = "^(Not free| free)$", message = " free must be either 'Reserved' or 'Not yet'")
    private String free ;

    @Pattern(regexp = "^(Not occupied| occupied)$", message = " occupied must be either 'Reserved' or 'Not yet'")
    private String occupied="Not occupied" ;

    String Description;
}
