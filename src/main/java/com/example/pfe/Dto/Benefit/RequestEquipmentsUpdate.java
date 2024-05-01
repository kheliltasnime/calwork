package com.example.pfe.Dto.Benefit;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class RequestEquipmentsUpdate {
    Long id;
    Date purchase_date; //date d'achat
    Integer quantity;
    Integer price;
    String maintenance_status;
    Long benefitId;
    // Expression régulière pour valider la propriété state
    @Pattern(regexp = "^(Enabled|Disabled)$", message = "State must be either 'Enabled' or 'Disabled'")
    private String state = "Enabled";


}
