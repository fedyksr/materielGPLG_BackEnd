package com.fedy.materiels.services.ordinateurServ;

import com.fedy.materiels.models.Ordinateur;

import java.util.List;

public interface OrdinateurService {
    Ordinateur saveOrdinateur(Ordinateur ordinateur);
    Ordinateur updateOrdinateur(Ordinateur ordinateur);
    void deleteOrdinateur(Ordinateur ordinateur);
    void deleteOrdinateurById(int IdOrdinateur);
    Ordinateur getOrdinateur(int IdOrdinateur);
    List<Ordinateur> getAllOrdinateur();
}
