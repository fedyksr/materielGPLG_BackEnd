package com.fedy.materiels.services.autreEquipServ;

import com.fedy.materiels.models.AutreEquipement;

import java.util.List;

public interface AutreEquipementService {
    AutreEquipement saveAutreEquipement(AutreEquipement autreEquipement);
    AutreEquipement updateAutreEquipement(AutreEquipement autreEquipement);
    void deleteAutreEquipement(AutreEquipement autreEquipement);
    void deleteAutreEquipementById(int IdAutreEquipement);
    AutreEquipement getAutreEquipement(int IdAutreEquipement);
    List<AutreEquipement> getAllAutreEquipement();
}
