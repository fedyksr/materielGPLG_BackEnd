package com.fedy.materiels.controller;

import com.fedy.materiels.models.AutreEquipement;
import com.fedy.materiels.services.autreEquipServ.AutreEquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class AutreEquipementController {
    @Autowired
    AutreEquipementService autreEquipementService;

    @RequestMapping("/showCreateautEqui")
    public String showCreate(){
        return "createAutreEquipement";
    }

    @RequestMapping("/saveAutreEquipement")
    public String saveAutreEquipemet(@ModelAttribute("autEqui")AutreEquipement autEqui, ModelMap modelMap){
        AutreEquipement saveAutreEquipemet= autreEquipementService.saveAutreEquipement(autEqui);
        String msg="autre equipement enregistré avec ID "+saveAutreEquipemet.getIdAutreEquipement();
        modelMap.addAttribute("msg",msg);
        return "createAutreEquipement";
    }

    @RequestMapping("/ListeAutresEquipements")
    public String listeAutresEquipements(ModelMap modelMap){
        List<AutreEquipement> aut=autreEquipementService.getAllAutreEquipement();
        modelMap.addAttribute("autresEquipements",aut);
        return  "listeAutresEquipements";
    }

    @RequestMapping("/supprimerAutreEquipement")
    public String supprimerAutreEquipement(@RequestParam("IdAutreEquipement") int IdAutreEquipement,ModelMap modelMap){
        AutreEquipement autEqui=new AutreEquipement();
        autEqui.setIdAutreEquipement(IdAutreEquipement);
        autreEquipementService.deleteAutreEquipement(autEqui);
        List<AutreEquipement> aut=autreEquipementService.getAllAutreEquipement();
        return "listeAutresEquipements";
    }

    @RequestMapping("/modifierAutreEquipement")
    public String editerAutreEquipement(@RequestParam("IdAutreEquipement") int IdAutreEquipement,ModelMap modelMap){
        AutreEquipement autEqui =autreEquipementService.getAutreEquipement(IdAutreEquipement);
        modelMap.addAttribute("autreEquipement",autEqui);
        return "listeAutresEquipements";
    }

    public String updateAutreEquipement(@ModelAttribute("autEqui") AutreEquipement autEqui,ModelMap modelMap){
        autreEquipementService.updateAutreEquipement(autEqui);
        List<AutreEquipement> aut =autreEquipementService.getAllAutreEquipement();
        modelMap.addAttribute("autresEquipements",aut);
        return "listeAutresEquipements";
    }
}**/
@RestController
@RequestMapping("/apiAutreEquipement")
@CrossOrigin(origins = "*")
public class AutreEquipementController {
    @Autowired
    AutreEquipementService autreEquipementService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AutreEquipement> getAllAutreEquipement(){
        return autreEquipementService.getAllAutreEquipement();
    }

    @RequestMapping(value = "/{IdAutreEquipement}",method = RequestMethod.GET)
    public AutreEquipement getAutreEquipementById(@PathVariable("IdAutreEquipement") int IdAutreEquipement){
        return autreEquipementService.getAutreEquipement(IdAutreEquipement);
    }

    @RequestMapping(method = RequestMethod.POST)
    public AutreEquipement createAutreEquipement(@RequestBody AutreEquipement autreEquipement){
        return autreEquipementService.saveAutreEquipement(autreEquipement);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public AutreEquipement updateAutreEquipement(@RequestBody AutreEquipement autreEquipement){
        return autreEquipementService.updateAutreEquipement(autreEquipement);
    }

    @RequestMapping(value = "/{IdAutreEquipement}",method = RequestMethod.DELETE)
    public void deleteAutreEquipement(@PathVariable("IdAutreEquipement") int IdAutreEquipement){
        autreEquipementService.deleteAutreEquipementById(IdAutreEquipement);
    }
}