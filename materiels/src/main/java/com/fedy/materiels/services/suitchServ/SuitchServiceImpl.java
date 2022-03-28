package com.fedy.materiels.services.suitchServ;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fedy.materiels.models.Suitch;
import com.fedy.materiels.repositorys.SuitchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SuitchServiceImpl implements SuitchService{

    @Autowired
    SuitchRepo suitchRepo;

    @Override
    public Suitch saveSuitch(Suitch suitch) {
        return suitchRepo.save(suitch);
    }

    @Override
    public Suitch updateSuitch(Suitch suitch) {
        return suitchRepo.save(suitch);
    }

    @Override
    public void deleteSuitch(Suitch suitch) {
        suitchRepo.delete(suitch);
    }

    @Override
    public void deleteSuitchById(int IdSuitch) {
        suitchRepo.deleteById(IdSuitch);
    }

    @Override
    public Suitch getSuitch(int IdSuitch) {
        return suitchRepo.findById(IdSuitch).orElse(null);
    }

    @Override
    public List<Suitch> getAllSuitchs() {
        List<Suitch> suitchList=suitchRepo.findAll();
        return suitchList;
    }
}
