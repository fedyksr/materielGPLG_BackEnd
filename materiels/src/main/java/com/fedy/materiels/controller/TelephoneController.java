package com.fedy.materiels.controller;

import com.fedy.materiels.models.Telephone;
import com.fedy.materiels.services.telephoneServ.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TelephoneController {
    @Autowired
    TelephoneService telephoneService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Telephone> getAllTelephones(){
        return telephoneService.getAllTelephones();
    }

    @RequestMapping(value="/{IdTelephone}",method = RequestMethod.GET)
    public Telephone getTelephoneById(@PathVariable("IdTelephone") int IdTelephone){
        return telephoneService.getTelephone(IdTelephone);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Telephone createTelephone(@RequestBody Telephone telephone){
        return telephoneService.saveTelephone(telephone);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Telephone updateTelephone(@RequestBody Telephone telephone){
        return telephoneService.updateTelephone(telephone);
    }

    @RequestMapping(value="/{IdTelephone}",method = RequestMethod.DELETE)
    public void deleteTelephone(@PathVariable("IdTelephone") int IdTelephone){
        telephoneService.deleteTelephoneById(IdTelephone);
    }
}


/**@Controller
public class TelephoneController {
    @Autowired
    TelephoneService telephoneService;

    @RequestMapping("/showCreateTelephone")
    public String showCreate() {
        return "createTelephone";
    }

    @RequestMapping("/saveTelephone")
    public String saveTelephone(@ModelAttribute("IdTelephone")Telephone telephone, ModelMap modelMap){
        Telephone saveTelephone=telephoneService.saveTelephone(telephone);
        String msg="telephone enregistré avec ID "+saveTelephone.getIdTelephone();
        modelMap.addAttribute("msg",msg);
        return "createTelephone";
    }

    @RequestMapping("/ListeTelephones")
    public String listeTelephones(ModelMap modelMap){
        List<Telephone> telephoneList=telephoneService.getAllTelephones();
        modelMap.addAttribute("telephones",telephoneList);
        return "listeTelephone";
    }

    @RequestMapping("/supprimerTelephone")
    public String supprimerTelephone(@RequestParam("IdTelephone") int IdTelephone,ModelMap modelMap){
        Telephone telephone=new Telephone();
        telephone.setIdTelephone(IdTelephone);
        telephoneService.deleteTelephone(telephone);
        List<Telephone> telephoneList=telephoneService.getAllTelephones();
        modelMap.addAttribute("telephones",telephoneList);
        return "listeTelephones";
    }

    @RequestMapping("/modifierTelephone")
    public String editerTelephone(@RequestParam("IdTelephone") int IdTelephone,ModelMap modelMap){
        Telephone telephone=telephoneService.getTelephone(IdTelephone);
        modelMap.addAttribute("telephone",telephone);
        return "editerTelephone";
    }

    @RequestMapping("/updateTelephone")
    public String updateTelephone(@ModelAttribute("telephone") Telephone telephone,ModelMap modelMap){
        telephoneService.updateTelephone(telephone);
        List<Telephone> telephoneList=telephoneService.getAllTelephones();
        modelMap.addAttribute("telephones",telephoneList);
        return "listeTelephones";
    }
}**/
