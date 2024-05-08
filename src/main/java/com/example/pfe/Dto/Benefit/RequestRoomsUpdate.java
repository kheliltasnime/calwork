package com.example.pfe.Dto.Benefit;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestRoomsUpdate {
    Long id;
    String maintenance_status;
    Integer capacity;
    Long benefitId;
    @Pattern(regexp = "^(Enabled|Disabled)$", message = "State must be either 'Enabled' or 'Disabled'")
    private String state = "Enabled";
    private String category="Rooms";
    @Pattern(regexp = "^(Reserved|Not yet)$", message = " Reservation State must be either 'Reserved' or 'Not yet'")
    private String Reservation_State = "Not yet";

    @Pattern(regexp = "^(Not free| free)$", message = " free must be either 'Reserved' or 'Not yet'")
    private String free ;

    @Pattern(regexp = "^(Not occupied| occupied)$", message = " occupied must be either 'Reserved' or 'Not yet'")
    private String occupied="Not occupied" ;

    String Description;

}
