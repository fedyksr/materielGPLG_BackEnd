package com.fedy.materiels.services.imprimanteServ;

import com.fedy.materiels.models.Imprimante;
import com.fedy.materiels.repositorys.ImprimanteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImprimanteServiceImpl implements ImprimanteService{

    @Autowired
    ImprimanteRepo imprimanteRepo;

    @Override
    public Imprimante saveImprimante(Imprimante imprimante) {
        return imprimanteRepo.save(imprimante);
    }

    @Override
    public Imprimante updateImprimante(Imprimante imprimante) {
        return imprimanteRepo.save(imprimante);
    }

    @Override
    public void deleteImprimanteById(int IdImprimante) {
        imprimanteRepo.deleteById(IdImprimante);
    }

    @Override
    public Imprimante getImprimante(int IdImprimante) {

        return imprimanteRepo.findById(IdImprimante).orElse(null);
    }

    @Override
    public List<Imprimante> getAllImprimante() {
        List<Imprimante> imprimanteList=imprimanteRepo.findAll();
        return imprimanteList;
    }
}
