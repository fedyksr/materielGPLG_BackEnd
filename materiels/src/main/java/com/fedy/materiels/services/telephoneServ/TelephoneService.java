package com.fedy.materiels.services.telephoneServ;

import com.fedy.materiels.models.Telephone;

import java.util.List;

public interface TelephoneService {
    Telephone saveTelephone(Telephone telephone);
    Telephone updateTelephone(Telephone telephone);
    void deleteTelephone(Telephone telephone);
    void deleteTelephoneById(int IdTelephone);
    Telephone getTelephone(int IdTelephone);
    List<Telephone> getAllTelephones();
}
