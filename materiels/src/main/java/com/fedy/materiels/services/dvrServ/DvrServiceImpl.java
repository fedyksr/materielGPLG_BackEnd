package com.fedy.materiels.services.dvrServ;

import com.fedy.materiels.models.Dvr;
import com.fedy.materiels.repositorys.DvrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DvrServiceImpl implements DvrService {

    @Autowired
    DvrRepo dvrrepo;

    @Override
    public Dvr saveDvr(Dvr d) {
        return dvrrepo.save(d);
    }

    @Override
    public Dvr updateDvr(Dvr d) {
        return dvrrepo.save(d);
    }

    @Override
    public void deleteDvr(Dvr d) {
        dvrrepo.delete(d);
    }

    @Override
    public void deleteDvrById(int IdDvr) {
        dvrrepo.deleteById(IdDvr);
    }

    @Override
    public Dvr getDvr(int IdDvr) {
        return dvrrepo.findById(IdDvr).orElse(null);
    }

    @Override
    public List<Dvr> getAllDvrs() {
        List<Dvr> dd=dvrrepo.findAll();
        return dd;
    }
}
