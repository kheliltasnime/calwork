package com.example.pfe.Service;

import com.example.pfe.Dto.Benefit.RequestEquip;
import com.example.pfe.Dto.Benefit.RequestEquipments;
import com.example.pfe.Dto.Benefit.ResponseEquip;

import java.util.List;

public interface EquipService {
    void createEquip(RequestEquip equipmentsRequest);
     void incrementNumberOfReservation(Long equipId);
    List<ResponseEquip> getAllEquip();
}
