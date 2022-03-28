package com.fedy.materiels.controller;

import com.fedy.materiels.models.Onduleur;
import com.fedy.materiels.services.onduleurServ.OnduleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class OnduleurController {

    @Autowired
    OnduleurService onduleurService;

    @RequestMapping("/showCreateOnduleur")
    public String showCreate(){
        return "createOnduleur";
    }

    @RequestMapping("/saveOnduleur")
    public String saveOnduleur(@ModelAttribute("onduleur")Onduleur onduleur, ModelMap modelMap){
        Onduleur saveOnduleur = onduleurService.saveOnduleur(onduleur);
        String msg ="onduleur enregistré avec ID "+saveOnduleur.getIdOnduleur();
        modelMap.addAttribute("msg", msg);
        return "createOnduleur";
    }

    @RequestMapping("/ListeOnduleur")
    public String listeOnduleurs(ModelMap modelMap){
        List<Onduleur> onduleurList=onduleurService.getAllOnduleurs();
        modelMap.addAttribute("onduleurs",onduleurList);
        return "listeOnduleur";
    }

    @RequestMapping("/supprimerOnduleur")
    public String supprimerOnduleur(@RequestParam("IdOnduleur") int IdOnduleur,ModelMap modelMap){
        Onduleur onduleur= new Onduleur();
        onduleur.setIdOnduleur(IdOnduleur);
        onduleurService.deleteOnduleur(onduleur);
        List<Onduleur> onduleurList=onduleurService.getAllOnduleurs();
        modelMap.addAttribute("onduleurs",onduleurList);
        return "listeOnduleurs";
    }

    @RequestMapping("/modifierOnduleur")
    public String editerOnduleur(@RequestParam("IdOnduleur") int IdOnduleur,ModelMap modelMap){
        Onduleur onduleur=onduleurService.getOnduleur(IdOnduleur);
        modelMap.addAttribute("onduleurs",onduleur);
        return "editerOnduleur";
    }

    @RequestMapping("/updateOnduleur")
    public String updateOnduleur(@ModelAttribute("onduleur") Onduleur onduleur,ModelMap modelMap){
        onduleurService.updateOnduleur(onduleur);
        List<Onduleur> onduleurList=onduleurService.getAllOnduleurs();
        modelMap.addAttribute("onduleurs",onduleurList);
        return "listeOnduleurs";
    }
}**/
@RestController
@RequestMapping("/apiOnduleur")
@CrossOrigin(origins = "*")
public class OnduleurController {
    @Autowired
    OnduleurService onduleurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Onduleur> getAllOnduleur(){
        return onduleurService.getAllOnduleurs();
    }

    @RequestMapping(value = "/{IdOnduleur}",method = RequestMethod.GET)
    public Onduleur getonduleurById(@PathVariable("IdOnduleur") int IdOnduleur){
        return onduleurService.getOnduleur(IdOnduleur);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Onduleur createOnduleur(@RequestBody Onduleur onduleur){
        return onduleurService.saveOnduleur(onduleur);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Onduleur updateOnduleur(@RequestBody Onduleur onduleur){
        return onduleurService.updateOnduleur(onduleur);
    }

    @RequestMapping(value = "/{IdOnduleur}",method = RequestMethod.DELETE)
    public void deleteOnduleur(@PathVariable("IdOnduleur") int IdOnduleur){
        onduleurService.deleteOnduleurById(IdOnduleur);
    }
}