package com.example.pfe.Dto.Benefit;

import com.example.pfe.Entities.Equipments;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.plaf.nimbus.State;
import java.time.Instant;
import java.util.Date;

import java.time.Instant;
import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEquipments {
    Long id;
    String name;
    String type;  //type d'equipment info , securite ..
    String manufactuer; // societe eli san3t el equip
    String model;
    Date purchase_date; //date d'achat
    Integer quantity;
    Integer price;
    String Description;
    String maintenance_status;
    Long benefitId;
    private Instant createdAt;
    private Instant updatedAt;
    private ResponseBenefit benefit;
    private String state;
    private String Reservation_State;
    private  String returned;
    private String  taken;

    String category="Equipments";
    public static ResponseEquipments makeEquipments(Equipments equipments){
        return ResponseEquipments.builder()
                .id(equipments.getId())
                .name(equipments.getName())
                .type(equipments.getType())
                .manufactuer(equipments.getManufactuer())
                .model(equipments.getModel())
                .purchase_date(equipments.getPurchase_date())
                .quantity(equipments.getQuantity())
                .Reservation_State(equipments.getReservation_State())
                .price(equipments.getPrice())
                .Description(equipments.getDescription())
                .taken(equipments.getTaken())
                .returned(equipments.getReturned())
                .category(equipments.getCategory())
                .Description(equipments.getDescription())
                .state(equipments.getState()) // Assigner la valeur de state
                .maintenance_status(equipments.getMaintenance_status())
                .benefit(ResponseBenefit.makeBenefit(equipments.getBenefit()))
                .createdAt(equipments.getCreatedAt())
                .updatedAt(equipments.getUpdatedAt())
                .build();
    }
}
