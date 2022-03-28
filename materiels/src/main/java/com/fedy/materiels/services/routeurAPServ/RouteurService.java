package com.fedy.materiels.services.routeurAPServ;

import com.fedy.materiels.models.Routeur;

import java.util.List;

public interface RouteurService {
    Routeur saveRouteurAP(Routeur routeur);
    Routeur updateRouteurAP(Routeur routeur);
    void deleteRouteurAP(Routeur routeur);
    void deleteRouteurById(int IdRouteur);
    Routeur getRouteurAP(int IdRouteur);
    List<Routeur> getAllRouteursAP();
}
