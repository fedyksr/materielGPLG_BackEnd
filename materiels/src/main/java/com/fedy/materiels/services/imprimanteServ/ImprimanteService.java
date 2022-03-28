package com.fedy.materiels.services.imprimanteServ;

import com.fedy.materiels.models.Imprimante;

import java.util.List;

public interface ImprimanteService {
    Imprimante saveImprimante(Imprimante imprimante);
    Imprimante updateImprimante(Imprimante imprimante);
    void deleteImprimanteById(int IdImprimante);
    Imprimante getImprimante(int IdImprimante);
    List<Imprimante> getAllImprimante();
}
