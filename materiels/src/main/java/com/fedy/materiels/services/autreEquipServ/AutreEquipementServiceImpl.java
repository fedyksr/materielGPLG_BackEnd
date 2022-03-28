package com.fedy.materiels.services.autreEquipServ;

import com.fedy.materiels.models.AutreEquipement;
import com.fedy.materiels.repositorys.AutreEquipementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutreEquipementServiceImpl implements AutreEquipementService {
    @Autowired
    AutreEquipementRepo autEquiRepo;

    @Override
    public AutreEquipement saveAutreEquipement(AutreEquipement autreEquipement) {
        return autEquiRepo.save(autreEquipement);
    }

    @Override
    public AutreEquipement updateAutreEquipement(AutreEquipement autreEquipement) {
        return autEquiRepo.save(autreEquipement);
    }

    @Override
    public void deleteAutreEquipement(AutreEquipement autreEquipement) {
        autEquiRepo.delete(autreEquipement);

    }

    @Override
    public void deleteAutreEquipementById(int IdAutreEquipement) {
        autEquiRepo.deleteById(IdAutreEquipement);
    }

    @Override
    public AutreEquipement getAutreEquipement(int IdAutreEquipement) {
        return autEquiRepo.findById(IdAutreEquipement).orElse(null);
    }

    @Override
    public List<AutreEquipement> getAllAutreEquipement() {
        List<AutreEquipement> aut=autEquiRepo.findAll();
        return aut;
    }
}
