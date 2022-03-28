package com.fedy.materiels.services.dvrServ;

import com.fedy.materiels.models.Dvr;

import java.util.List;

public interface DvrService {
    Dvr saveDvr(Dvr d);
    Dvr updateDvr(Dvr d);
    void deleteDvr (Dvr d);
    void deleteDvrById(int IdDvr);
    Dvr getDvr(int IdDvr);
    List<Dvr> getAllDvrs();
}
