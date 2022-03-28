package com.fedy.materiels.services.routeurAPServ;

import com.fedy.materiels.models.Routeur;
import com.fedy.materiels.repositorys.RouteurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RouteurServiceImpl implements RouteurService {

    @Autowired
    RouteurRepo routeurRepo;

    @Override
    public Routeur saveRouteurAP(Routeur routeur) {
        return routeurRepo.save(routeur);
    }

    @Override
    public Routeur updateRouteurAP(Routeur routeur) {
        return routeurRepo.save(routeur);
    }

    @Override
    public void deleteRouteurAP(Routeur routeur) {
        routeurRepo.delete(routeur);
    }

    @Override
    public void deleteRouteurById(int IdRouteur) {
        routeurRepo.deleteById(IdRouteur);
    }

    @Override
    public Routeur getRouteurAP(int IdRouteur) {
        return routeurRepo.findById(IdRouteur).orElse(null);
    }

    @Override
    public List<Routeur> getAllRouteursAP() {
        List<Routeur> listRouteur= routeurRepo.findAll();
        return listRouteur;
    }
}
