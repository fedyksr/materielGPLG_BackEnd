package com.fedy.materiels.controller;

import com.fedy.materiels.models.Ordinateur;
import com.fedy.materiels.services.ordinateurServ.OrdinateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@RestController
public class OrdinateurController {
    @Autowired
    OrdinateurService ordinateurService;

    @RequestMapping("/showCreateOrdinateur")
    public String showCreate() {
        return "createOrdinateur";
    }

    @RequestMapping("/saveOrdinateur")
    public String saveOrdinateur(@ModelAttribute("ordinateur") Ordinateur ordinateur, ModelMap modelMap){
        Ordinateur saveOrdinateur = ordinateurService.saveOrdinateur(ordinateur);
        String msg="ordinateur enregistré avec ID"+saveOrdinateur.getIdOrdinateur();
        modelMap.addAttribute("msg",msg);
        return "createOrdinateur";
    }

    @RequestMapping("/ListeOrdinateur")
    public String listeOrdinateur(ModelMap modelMap){
        List<Ordinateur> ordinateurList =ordinateurService.getAllOrdinateurs();
        modelMap.addAttribute("ordinateurs",ordinateurList);
        return "ListeOrdinateurs";
    }

    @RequestMapping("/supprimerOrdinateur")
    public String supprimerOrdinateur(@RequestParam("IdOrdinateur") int IdOrdinateur,ModelMap modelMap){
        Ordinateur ordinateur=new Ordinateur();
        ordinateur.setIdOrdinateur(IdOrdinateur);
        ordinateurService.deleteOrdinateur(ordinateur);
        List<Ordinateur> ordinateurList =ordinateurService.getAllOrdinateurs();
        modelMap.addAttribute("ordinateurs",ordinateurList);
        return "listeOrdinateur";
    }

    @RequestMapping("/modifierOrdinateur")
    public String editerOrdinateur(@RequestParam("IdOrdinateur") int IdOrdinateur,ModelMap modelMap){
        Ordinateur ordinateur=ordinateurService.getOrdinateur(IdOrdinateur);
        modelMap.addAttribute("ordinateur",ordinateur);
        return "editerOrdinateur";
    }

    @RequestMapping("/updateOrdinateur")
    public String updateOrdinateur(@ModelAttribute("ordinateur") Ordinateur ordinateur,ModelMap modelMap){
        ordinateurService.updateOrdinateur(ordinateur);
        List<Ordinateur> ordinateurList=ordinateurService.getAllOrdinateurs();
        modelMap.addAttribute("produits",ordinateurList);
        return "listeOrdinateur";
    }
}**/
@RestController
@RequestMapping("/apiOrdinateur")
@CrossOrigin(origins = "http://127.0.0.1:4200/")
public class OrdinateurController {
    @Autowired
    OrdinateurService ordinateurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Ordinateur> getAllOrdinateur(){
        return ordinateurService.getAllOrdinateur();
    }

    @RequestMapping(value = "/{idOrdinateur}",method = RequestMethod.GET)
    public Ordinateur getOrdinateurById(@PathVariable("idOrdinateur") int idOrdinateur){
        return ordinateurService.getOrdinateur(idOrdinateur);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Ordinateur createOrdinateur(@RequestBody Ordinateur ordinateur){
        return ordinateurService.saveOrdinateur(ordinateur);
    }
    @RequestMapping(value="/{idOrdinateur}" ,method = RequestMethod.PUT)
    public Ordinateur updateOrdinateur(@RequestBody Ordinateur ordinateur){
        return ordinateurService.updateOrdinateur(ordinateur);
    }

    @RequestMapping(value="/{idOrdinateur}",method = RequestMethod.DELETE)
    public void deleteOrdinateurById(@PathVariable("idOrdinateur") int idOrdinateur){
        ordinateurService.deleteOrdinateurById(idOrdinateur);
    }
}