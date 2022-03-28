package com.fedy.materiels.services.ecranServ;

import com.fedy.materiels.models.Ecran;
import com.fedy.materiels.repositorys.EcranRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EcranServiceImpl implements EcranService{
    @Autowired
    EcranRepo ecranRepo;
    @Override
    public Ecran saveEcran(Ecran ecran) {
        return ecranRepo.save(ecran);
    }

    @Override
    public Ecran updateEcran(Ecran ecran) {
        return ecranRepo.save(ecran);
    }

    @Override
    public void deleteEcranById(int IdEcran) {
        ecranRepo.deleteById(IdEcran);
    }

    @Override
    public Ecran getEcran(int IdEcran) {
        return ecranRepo.findById(IdEcran).orElse(null);
    }

    @Override
    public List<Ecran> getAllEcran() {
        List<Ecran> ecranList=ecranRepo.findAll();
        return ecranList;
    }
}
