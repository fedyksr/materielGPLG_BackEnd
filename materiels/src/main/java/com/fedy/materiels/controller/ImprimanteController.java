package com.fedy.materiels.controller;

import com.fedy.materiels.models.DisqueDur;
import com.fedy.materiels.models.Imprimante;
import com.fedy.materiels.services.imprimanteServ.ImprimanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class ImprimanteController {
    @Autowired
    ImprimanteService imprimanteService;

    @RequestMapping("/showCreateImprimante")
    public String showCreate(){
        return "createImprimante";
    }

    @RequestMapping("/saveImprimante")
    public String saveImprimante(@ModelAttribute("imprimante")Imprimante imprimante,ModelMap modelMap){
        Imprimante saveImprimante=imprimanteService.saveImprimante(imprimante);
        String msg="imprimante enregistré avec ID"+saveImprimante.getIdImprimante();
        modelMap.addAttribute("msg",msg);
        return "createImprimante";
    }

    @RequestMapping("/ListeImprimantes")
    public String listeImprimante(ModelMap modelMap){
        List<Imprimante> imprimanteList=imprimanteService.getAllImprimante();
        modelMap.addAttribute("imprimantes",imprimanteList);
        return "listeImprimantes";
    }

    @RequestMapping("/supprimerImprimante")
    public String supprimerImprimante(@RequestParam("IdImprimante") int IdImprimante,ModelMap modelMap){
        Imprimante imprimante=new Imprimante();
        imprimante.setIdImprimante(IdImprimante);
        imprimanteService.deleteImprimante(imprimante);
        List<Imprimante> imprimanteList=imprimanteService.getAllImprimante();
        modelMap.addAttribute("imprimantes",imprimanteList);
        return "listeImprimantes";
    }

    @RequestMapping("/modifierImprimante")
    public String editerImprimante(@RequestParam("IdImprimante") int IdImprimante,ModelMap modelMap){
        Imprimante imprimante=imprimanteService.getImprimante(IdImprimante);
        modelMap.addAttribute("imprimante",imprimante);
        return "editerImprimante";
    }

    @RequestMapping("/updateImprimante")
    public String updateImprimante(@ModelAttribute("imprimante") Imprimante imprimante,ModelMap modelMap){
        imprimanteService.updateImprimante(imprimante);
        List<Imprimante> imprimanteList=imprimanteService.getAllImprimante();
        modelMap.addAttribute("imprimantes",imprimanteList);
        return "listeImprimante";
    }
}**/
@RestController
@RequestMapping("/apiImprimante")
@CrossOrigin(origins = "*")
public class ImprimanteController {
    @Autowired
    ImprimanteService imprimanteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Imprimante> getAllImprimante(){
        return imprimanteService.getAllImprimante();
    }

    @RequestMapping(value="/{IdImprimante}",method = RequestMethod.GET)
    public Imprimante getImprimanteById(@PathVariable("IdImprimante") int IdImprimante){
        return imprimanteService.getImprimante(IdImprimante);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Imprimante createImprimante(@RequestBody Imprimante imprimante){
        return imprimanteService.saveImprimante(imprimante);
    }

    @RequestMapping(value="/{IdImprimante}",method = RequestMethod.PUT)
    public Imprimante updateImprimante(@RequestBody Imprimante imprimante){
        return imprimanteService.updateImprimante(imprimante);
    }

    @RequestMapping(value="/{IdImprimante}",method = RequestMethod.DELETE)
    public void deleteImprimanteById(@PathVariable("IdImprimante") int IdImprimante){
        imprimanteService.deleteImprimanteById(IdImprimante);
    }
}