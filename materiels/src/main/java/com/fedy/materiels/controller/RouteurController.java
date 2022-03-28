package com.fedy.materiels.controller;

import com.fedy.materiels.models.Routeur;
import com.fedy.materiels.services.routeurAPServ.RouteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class RouteurController {
    @Autowired
    RouteurService routeurService;

    @RequestMapping("/showCreateRouteur")
    public String showCreate()
    {
        return "createRouteur";
    }

    @RequestMapping("/saveRouteur")
    public String saveRouteur(@ModelAttribute("routeur") Routeur routeur, ModelMap modelMap){
        Routeur saveRouteur = routeurService.saveRouteurAP(routeur);
        String msg="routeur enregistré avec ID"+saveRouteur.getIdRouteur();
        modelMap.addAttribute("msg",msg);
        return "createRouteur";
    }

    @RequestMapping("/ListeRouteurs")
    public String listeRouteurs(ModelMap modelMap){
        List<Routeur> listRouteur= routeurService.getAllRouteursAP();
        modelMap.addAttribute("routeurs",listRouteur);
        return "listeRouteurs";
    }

    @RequestMapping("/supprimerRouteur")
    public String supprimerRouteur(@RequestParam("IdRouteur") int IdRouteur,ModelMap modelMap){
        Routeur routeur =new Routeur();
        routeur.setIdRouteur(IdRouteur);
        routeurService.deleteRouteurAP(routeur);
        List<Routeur> listRouteur= routeurService.getAllRouteursAP();
        modelMap.addAttribute("routeurs",listRouteur);
        return "listeRouteurs";
    }

    @RequestMapping("/modifierRouteur")
    public String editerRouteur(@RequestParam("IdRouteur") int IdRouteur,ModelMap modelMap){
        Routeur routeur = routeurService.getRouteurAP(IdRouteur);
        modelMap.addAttribute("routeur", routeur);
        return "editerRouteur";
    }

    @RequestMapping("/updateRouteur")
    public String updateRouteur(@ModelAttribute("routeur") Routeur routeur, ModelMap modelMap){
        routeurService.updateRouteurAP(routeur);
        List<Routeur> listRouteur= routeurService.getAllRouteursAP();
        modelMap.addAttribute("routeurs",listRouteur);
        return "listeRouteurs";
    }
}**/
@RestController
@RequestMapping("/apiRouteur")
@CrossOrigin(origins = "*")
public class RouteurController {
    @Autowired
    RouteurService routeurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Routeur> getAllRouteur() {
        return routeurService.getAllRouteursAP();
    }

    @RequestMapping(value="/{IdRouteur}",method = RequestMethod.GET)
    public Routeur getRouteurById(@PathVariable("id") int IdRouteur) {
        return routeurService.getRouteurAP(IdRouteur);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Routeur createRouteur(@RequestBody Routeur routeur) {
        return routeurService.saveRouteurAP(routeur);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Routeur updateRouteur(@RequestBody Routeur routeur) {
        return routeurService.updateRouteurAP(routeur);
    }

    @RequestMapping(value="/{IdRouteur}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("IdRouteur") int IdRouteur)
    {
        routeurService.deleteRouteurById(IdRouteur);
    }
}