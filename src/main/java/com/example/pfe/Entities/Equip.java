package com.example.pfe.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "equip")
@Builder
public class Equip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String model;
    int numberofreserv;
    Long equipId;
    Integer quantity;
    Integer price;
    String maintenance_status;
}
