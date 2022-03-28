package com.fedy.materiels.services.disquedurServ;

import com.fedy.materiels.models.DisqueDur;
import com.fedy.materiels.repositorys.DisquedurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisquedurServiceImpl implements DisquedurService {

    @Autowired
    DisquedurRepo ddrRepo;

    @Override
    public DisqueDur saveDDR(DisqueDur disqueDur) {
        return ddrRepo.save(disqueDur);
    }

    @Override
    public DisqueDur updateDDR(DisqueDur disqueDur) {
        return ddrRepo.save(disqueDur);
    }

    @Override
    public void deleteDDR(DisqueDur disqueDur) {
        ddrRepo.delete(disqueDur);
    }

    @Override
    public void deleteDDRById(int IdDisqueDur) {
        ddrRepo.deleteById(IdDisqueDur);
    }

    @Override
    public DisqueDur getDDR(int IdDisqueDur) {
        return ddrRepo.findById(IdDisqueDur).orElse(null);
    }

    @Override
    public List<DisqueDur> getAllDDR() {
        List<DisqueDur> disqueDurs =ddrRepo.findAll();
        return disqueDurs;
    }
}
