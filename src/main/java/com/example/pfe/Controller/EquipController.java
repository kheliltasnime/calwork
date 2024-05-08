package com.example.pfe.Controller;

import com.example.pfe.Dto.Benefit.RequestEquip;
import com.example.pfe.Dto.Benefit.RequestEquipments;
import com.example.pfe.Dto.Benefit.ResponseEquip;
import com.example.pfe.Dto.Benefit.ResponseEquipments;
import com.example.pfe.Service.EquipService;
import com.example.pfe.Service.EquipmentsService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/arsii/equip")
@RequiredArgsConstructor
public class EquipController {
    @Autowired
    private EquipService equipmentsService;
    @PostMapping("")
    public ResponseEntity<Object> addEquipments(@RequestBody @Valid RequestEquip request){
        equipmentsService.createEquip(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap("message","save success !")
        );
    }

    // Endpoint pour incrémenter le nombre de réservations d'un équipement par son ID
    @PutMapping("/{equipId}/increment-reservation")
    public void incrementNumberOfReservation(@PathVariable Long equipId) {
        equipmentsService.incrementNumberOfReservation(equipId);
    }

    @GetMapping("")
    public ResponseEntity<List<ResponseEquip>>getAllEquip(){
        List<ResponseEquip> equipments = equipmentsService.getAllEquip();
        return ResponseEntity.ok(equipments);
    }



}
