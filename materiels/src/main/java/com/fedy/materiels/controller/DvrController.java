package com.fedy.materiels.controller;
import com.fedy.materiels.models.Dvr;
import com.fedy.materiels.services.dvrServ.DvrService;
import org.hibernate.annotations.common.reflection.XMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class DvrController {
    @Autowired
    DvrService dvrService;

    @RequestMapping("/showCreateDvr")
    public String showCreate(){
        return "CreateDvr";
    }

    @RequestMapping("/saveDvr")
    public String saveDvr(@ModelAttribute("dvr")Dvr dvr, ModelMap modelMap){
        Dvr saveDvr=dvrService.saveDvr(dvr);
        String msg="Dvr enregistré avec ID"+saveDvr.getIdDvr();
        modelMap.addAttribute("msg",msg);
        return "createDvr";
    }

    @RequestMapping("/ListeDvrs")
    public String listeDvr(ModelMap modelMap){
        List<Dvr> dd=dvrService.getAllDvrs();
        modelMap.addAttribute("dvrs",dd);
        return "listeDvrs";
    }

    @RequestMapping("/supprimerDvr")
    public String supprimerDvr(@RequestParam("IdDvr") int IdDvr,ModelMap modelMap){
        Dvr d=new Dvr();
        d.setIdDvr(IdDvr);
        dvrService.deleteDvr(d);
        List<Dvr> dd=dvrService.getAllDvrs();
        modelMap.addAttribute("dvr", d);
        return "listeDvrs";
    }

    @RequestMapping("/modifierDvr")
    public String editerDvr(@RequestParam("IdDvr") int IdDvr,ModelMap modelMap){
        Dvr d=dvrService.getDvr(IdDvr);
        modelMap.addAttribute("dvr",d);
        return "editerDvr";
    }

    @RequestMapping("/updateDvr")
    public String updateDvr(@ModelAttribute("dvr") Dvr dvr,ModelMap modelMap){
        dvrService.updateDvr(dvr);
        List<Dvr> dd=dvrService.getAllDvrs();
        modelMap.addAttribute("dvrs",dd);
        return "listeDvrs";
    }
}**/
@RestController
@RequestMapping("/apiDvr")
@CrossOrigin(origins = "*")
public class DvrController {
    @Autowired
    DvrService dvrService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Dvr> getAllDvr(){
        return dvrService.getAllDvrs();
    }

    @RequestMapping(value = "/{IdDvr}",method = RequestMethod.GET)
    public Dvr getDvrById(@PathVariable("IdDvr") int IdDvr){
        return dvrService.getDvr(IdDvr);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Dvr createDvr(@RequestBody Dvr d){
        return dvrService.saveDvr(d);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Dvr updateDvr(@RequestBody Dvr d){
        return dvrService.updateDvr(d);
    }

    @RequestMapping(value="/{IdDvr}",method = RequestMethod.DELETE)
    public void deleteDvr(@PathVariable("IdDvr") int IdDvr){
        dvrService.deleteDvrById(IdDvr);
    }
}