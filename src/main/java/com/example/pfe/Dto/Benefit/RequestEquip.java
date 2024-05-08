package com.example.pfe.Dto.Benefit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestEquip {
    Long id;
    String name;
    String model;
    int numberofreserv;
    Long equipId;
    Integer quantity;
    Integer price;
    String maintenance_status;
}
