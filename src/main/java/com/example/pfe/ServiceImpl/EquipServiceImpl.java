package com.example.pfe.ServiceImpl;

import com.example.pfe.Dto.Benefit.RequestEquip;
import com.example.pfe.Dto.Benefit.RequestEquipments;
import com.example.pfe.Dto.Benefit.ResponseEquip;
import com.example.pfe.Dto.Benefit.ResponseEquipments;
import com.example.pfe.Entities.Benefit;
import com.example.pfe.Entities.Equip;
import com.example.pfe.Entities.Equipments;
import com.example.pfe.Repository.EquipRepository;
import com.example.pfe.Repository.EquipmentsRepository;
import com.example.pfe.Service.EquipService;
import com.example.pfe.Service.EquipmentsService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipServiceImpl implements EquipService {
    @Autowired
    private EquipRepository equipmentsRepository;
    @Override
    public List<ResponseEquip> getAllEquip() {
        List<Equip> equipments = equipmentsRepository.findAll();
        List<ResponseEquip> userFormated = new ArrayList<>();
        for (Equip equipments1 : equipments){
            ResponseEquip member = ResponseEquip.makeEquip(equipments1);
            userFormated.add(member);
        }
        return userFormated;
    }

    @Override
    public void createEquip(RequestEquip equipmentsRequest) {


        Equip equipments = Equip.builder()
                .name(equipmentsRequest.getName())
                .model(equipmentsRequest.getModel())
                .quantity(equipmentsRequest.getQuantity())
                .price(equipmentsRequest.getPrice())

                .equipId(equipmentsRequest.getEquipId())
                .numberofreserv((equipmentsRequest.getNumberofreserv()))
                .maintenance_status(equipmentsRequest.getMaintenance_status())
                .build();
        equipmentsRepository.save(equipments);
    }
    @Override
    @Transactional // Transactional pour s'assurer que l'opération est atomique
    public void incrementNumberOfReservation(Long equipId) {
        Equip equip = equipmentsRepository.findById(equipId)
                .orElseThrow(() -> new IllegalArgumentException("Equip not found with id: " + equipId));
        // Incrémenter le nombre de réservations
        equip.setNumberofreserv(equip.getNumberofreserv() + 1);
        equipmentsRepository.save(equip);
    }








}
