package com.fedy.materiels.services.suitchServ;

import com.fedy.materiels.models.Suitch;

import java.util.List;

public interface SuitchService {
    Suitch saveSuitch(Suitch suitch);
    Suitch updateSuitch(Suitch suitch);
    void deleteSuitch(Suitch suitch);
    void deleteSuitchById(int IdSuitch);
    Suitch getSuitch(int IdSuitch);
    List<Suitch> getAllSuitchs();
}
