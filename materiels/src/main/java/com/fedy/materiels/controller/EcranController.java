package com.fedy.materiels.controller;

import com.fedy.materiels.models.Dvr;
import com.fedy.materiels.models.Ecran;
import com.fedy.materiels.services.ecranServ.EcranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiEcran")
@CrossOrigin(origins = "*")
public class EcranController {
    @Autowired
    EcranService ecranService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ecran> getAllEcran() {
        return ecranService.getAllEcran();
    }

    @RequestMapping(value = "/{IdEcran}",method = RequestMethod.GET)
    public Ecran getEcranById(@PathVariable("IdEcran") int IdEcran){
        return ecranService.getEcran(IdEcran);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Ecran createEcran(@RequestBody Ecran ecran){
        return ecranService.saveEcran(ecran);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ecran updateEcran(@RequestBody Ecran ecran) {
        return ecranService.updateEcran(ecran);
    }

    @RequestMapping(value="/{IdEcran}",method = RequestMethod.DELETE)
    public void deleteEcran(@PathVariable("IdEcran") int IdEcran){
        ecranService.deleteEcranById(IdEcran);
    }
}
