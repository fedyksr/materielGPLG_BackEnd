package com.fedy.materiels.services.ordinateurServ;

import com.fedy.materiels.models.Ordinateur;
import com.fedy.materiels.repositorys.OrdinateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrdinateurServiceImpl implements OrdinateurService{
    @Autowired
    OrdinateurRepo ordinateurRepo;

    @Override
    public Ordinateur saveOrdinateur(Ordinateur ordinateur) {
        return ordinateurRepo.save(ordinateur);
    }

    @Override
    public Ordinateur updateOrdinateur(Ordinateur ordinateur) {
        return ordinateurRepo.save(ordinateur);
    }

    @Override
    public void deleteOrdinateur(Ordinateur ordinateur) {
        ordinateurRepo.delete(ordinateur);
    }

    @Override
    public void deleteOrdinateurById(int IdOrdinateur) {
        ordinateurRepo.deleteById(IdOrdinateur);
    }

    @Override
    public Ordinateur getOrdinateur(int IdOrdinateur) {
        return ordinateurRepo.findById(IdOrdinateur).get();
    }

    @Override
    public List<Ordinateur> getAllOrdinateur() {
        return ordinateurRepo.findAll();
    }
}
