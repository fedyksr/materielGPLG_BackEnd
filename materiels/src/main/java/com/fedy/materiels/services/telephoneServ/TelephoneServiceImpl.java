package com.fedy.materiels.services.telephoneServ;

import com.fedy.materiels.models.Telephone;
import com.fedy.materiels.repositorys.TelephoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TelephoneServiceImpl implements TelephoneService{

    @Autowired
    TelephoneRepo telephoneRepo;

    @Override
    public Telephone saveTelephone(Telephone telephone) {
        return telephoneRepo.save(telephone);
    }

    @Override
    public Telephone updateTelephone(Telephone telephone) {
        return telephoneRepo.save(telephone);
    }

    @Override
    public void deleteTelephone(Telephone telephone) {
        telephoneRepo.delete(telephone);
    }

    @Override
    public void deleteTelephoneById(int IdTelephone) {
        telephoneRepo.deleteById(IdTelephone);
    }

    @Override
    public Telephone getTelephone(int IdTelephone) {
        return telephoneRepo.findById(IdTelephone).orElse(null);
    }

    @Override
    public List<Telephone> getAllTelephones() {
        List<Telephone> telephoneList=telephoneRepo.findAll();
        return telephoneList;
    }
}
