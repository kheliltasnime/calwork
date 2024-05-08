package com.example.pfe.Dto.Benefit;

import com.example.pfe.Entities.Equip;
import com.example.pfe.Entities.Equipments;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEquip {
    Long id;
    String name;
    String model;
    int numberofreserv;
    Integer quantity;
    Integer price;
    Long equipId;
    String maintenance_status;
    public static ResponseEquip makeEquip(Equip equipments){
        return ResponseEquip.builder()
                .id(equipments.getId())
                .name(equipments.getName())
                .equipId(equipments.getEquipId())
                .model(equipments.getModel())
                .numberofreserv(equipments.getNumberofreserv())
                .quantity(equipments.getQuantity())
                .price(equipments.getPrice())
                .maintenance_status(equipments.getMaintenance_status())
                .build();
    }
}
