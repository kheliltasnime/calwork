package com.example.pfe.Dto.Benefit;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestEquipments {
    Long id;
    String name;
    String type;  //type d'equipment info , securite ..
    String manufactuer; // societe eli san3t el equip
    String model;
    Date purchase_date; //date d'achat
    Integer quantity;
    Integer price;
    String maintenance_status;
    @Min(value = 1 , message = "benefit is required")
    Long benefitId;
    // Expression régulière pour valider la propriété state
    @Pattern(regexp = "^(Enabled|Disabled)$", message = "State must be either 'Enabled' or 'Disabled'")
    private String state = "Enabled";


}
