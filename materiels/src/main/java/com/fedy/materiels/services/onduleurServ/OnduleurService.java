package com.fedy.materiels.services.onduleurServ;

import com.fedy.materiels.models.Onduleur;

import java.util.List;

public interface OnduleurService {
    Onduleur saveOnduleur(Onduleur onduleur);
    Onduleur updateOnduleur(Onduleur onduleur);
    void deleteOnduleur(Onduleur onduleur);
    void deleteOnduleurById(int IdOnduleur);
    Onduleur getOnduleur(int IdOnduleur);
    List<Onduleur> getAllOnduleurs();
}
