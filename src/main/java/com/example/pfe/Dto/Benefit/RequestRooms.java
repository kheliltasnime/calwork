package com.example.pfe.Dto.Benefit;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestRooms {
    Long id;
    String name;
    String type;
    String location;
    String maintenance_status;
    Integer capacity;
    @Min(value = 1 , message = "benefit is required")
    Long benefitId;
    private String category="Rooms";
    @Pattern(regexp = "^(Enabled|Disabled)$", message = "State must be either 'Enabled' or 'Disabled'")
    private String state = "Enabled";

}
