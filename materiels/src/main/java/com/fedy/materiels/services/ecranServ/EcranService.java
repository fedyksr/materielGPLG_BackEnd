package com.fedy.materiels.services.ecranServ;

import com.fedy.materiels.models.Ecran;

import java.util.List;

public interface EcranService {
    Ecran saveEcran(Ecran ecran);
    Ecran updateEcran(Ecran ecran);
    void deleteEcranById(int IdEcran);
    Ecran getEcran(int IdEcran);
    List<Ecran> getAllEcran();
}
