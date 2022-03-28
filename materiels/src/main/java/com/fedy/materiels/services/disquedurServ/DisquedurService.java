package com.fedy.materiels.services.disquedurServ;

import com.fedy.materiels.models.DisqueDur;

import java.util.List;

public interface DisquedurService {
    DisqueDur saveDDR(DisqueDur disqueDur);
    DisqueDur updateDDR(DisqueDur disqueDur);
    void deleteDDR(DisqueDur disqueDur);
    void deleteDDRById(int IdDisqueDur);
    DisqueDur getDDR(int IdDisqueDur);
    List<DisqueDur> getAllDDR();
}
