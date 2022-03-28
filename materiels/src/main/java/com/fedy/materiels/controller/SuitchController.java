package com.fedy.materiels.controller;

import com.fedy.materiels.models.Suitch;
import com.fedy.materiels.services.suitchServ.SuitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiSuitch")
@CrossOrigin(origins = "*")
public class SuitchController {
    @Autowired
    SuitchService suitchService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Suitch> getAllSuitchers(){
        return suitchService.getAllSuitchs();
    }

    @RequestMapping(value="/{IdSuitch}",method = RequestMethod.GET)
    public Suitch getSuitchById(@PathVariable("IdSuitch") int IdSuitch){
        return suitchService.getSuitch(IdSuitch);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Suitch createSuitch(@RequestBody Suitch suitch){
        return suitchService.saveSuitch(suitch);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Suitch updateSuitch(@RequestBody Suitch suitch){
        return suitchService.updateSuitch(suitch);
    }

    @RequestMapping(value="/{IdSuitch}",method = RequestMethod.DELETE)
    public void deleteSuitch(@PathVariable("IdSuitch") int IdSuitch){
        suitchService.deleteSuitchById(IdSuitch);
    }
}
/**@Controller
public class SuitchController {
    @Autowired
    SuitchService suitchService;

    @RequestMapping("/showCreateSuitch")
    public String showCreate() {
        return "createSuitch";
    }

    @RequestMapping("/saveSuitch")
    public String saveSuitch(@ModelAttribute("suitch")Suitch suitch, ModelMap modelMap){
        Suitch saveSuitch=suitchService.saveSuitch(suitch);
        String msg="suitch enregistré avecID "+saveSuitch.getIdSuitch();
        modelMap.addAttribute("msg",msg);
        return "createSuitch";
    }

    @RequestMapping("/ListeSuitch")
    public String listeSuitchs(ModelMap modelMap){
        List<Suitch> suitchList=suitchService.getAllSuitchs();
        modelMap.addAttribute("suitchs",suitchList);
        return "listeSuitchs";
    }

    @RequestMapping("/supprimerSuitch")
    public String supprimerSuitch(@RequestParam("IdSuitch") int IdSuitch,ModelMap modelMap){
        Suitch suitch=new Suitch();
        suitch.setIdSuitch(IdSuitch);
        suitchService.deleteSuitch(suitch);
        List<Suitch> suitchList=suitchService.getAllSuitchs();
        modelMap.addAttribute("suitchs",suitchList);
        return "listeSuitchs";
    }

    @RequestMapping("/modifierSuitch")
    public String editerSuitch(@RequestParam("IdSuitch") int IdSuitch,ModelMap modelMap){
        Suitch suitch= suitchService.getSuitch(IdSuitch);
        modelMap.addAttribute("suitch",suitch);
        return "editerSuitch";
    }

    @RequestMapping("/updateSuitch")
    public String updateSuitch(@ModelAttribute("suitch") Suitch suitch,ModelMap modelMap){
        suitchService.updateSuitch(suitch);
        List<Suitch> suitchList=suitchService.getAllSuitchs();
        modelMap.addAttribute("suitchs",suitchList);
        return "ListeSuitch";
    }
}**/