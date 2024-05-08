package com.example.pfe.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.apache.tomcat.util.bcel.Const;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equipments")
@Builder
public class Equipments {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String type;  //type d'equipment info , securite ..
    String manufactuer; // societe eli san3t el equip
    String model;
    Date purchase_date; //date d'achat
    Integer quantity;
    Integer price;
    String maintenance_status;
    @Pattern(regexp = "^(Reserved|Not yet)$", message = " Reservation State must be either 'Reserved' or 'Not yet'")
    private String Reservation_State = "Not yet";

    @Pattern(regexp = "^(Not returned| returned)$", message = " Reterned must be either 'Reserved' or 'Not yet'")
    private String returned ;

    @Pattern(regexp = "^(Not taken| taken)$", message = " Taken must be either 'Reserved' or 'Not yet'")
    private String taken="Not taken" ;

String Description;
    private String category="Equipments";
    // Expression régulière pour valider la propriété state
    @Pattern(regexp = "^(Enabled|Disabled)$", message = "State must be either 'Enabled' or 'Disabled'")
    private String state = "Enabled";
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;

    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

}
