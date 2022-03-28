package com.fedy.materiels.services.onduleurServ;

import com.fedy.materiels.models.Onduleur;
import com.fedy.materiels.repositorys.OnduleurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OnduleurServiceImpl implements OnduleurService{

    @Autowired
    OnduleurRepo onduleurRepo;

    @Override
    public Onduleur saveOnduleur(Onduleur onduleur) {
        return onduleurRepo.save(onduleur);
    }

    @Override
    public Onduleur updateOnduleur(Onduleur onduleur) {
        return onduleurRepo.save(onduleur);
    }

    @Override
    public void deleteOnduleur(Onduleur onduleur) {
        onduleurRepo.delete(onduleur);
    }

    @Override
    public void deleteOnduleurById(int IdOnduleur) {
        onduleurRepo.deleteById(IdOnduleur);
    }

    @Override
    public Onduleur getOnduleur(int IdOnduleur) {
        return onduleurRepo.findById(IdOnduleur).orElse(null);
    }

    @Override
    public List<Onduleur> getAllOnduleurs() {
        List<Onduleur> onduleurList= onduleurRepo.findAll();
        return onduleurList;
    }
}
