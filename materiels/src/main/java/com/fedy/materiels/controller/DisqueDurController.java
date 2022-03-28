package com.fedy.materiels.controller;

import com.fedy.materiels.models.DisqueDur;
import com.fedy.materiels.services.disquedurServ.DisquedurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class DisqueDurController {
    @Autowired
    DisquedurService disquedurService;

    @RequestMapping("/showCreateDDR")
    public String showCreate(){
        return "createDisqueDur";
    }

    @RequestMapping("/saveDisqueDur")
    public String saveDisqueDur(@ModelAttribute("disqueDur") DisqueDur disqueDur,ModelMap modelMap){
        DisqueDur saveDisqueDur = disquedurService.saveDDR(disqueDur);
        String msg="disque dur enregistré avec ID"+saveDisqueDur.getIdDisqueDur();
        modelMap.addAttribute("msg",msg);
        return "createDisqueDur";
    }

    @RequestMapping("/ListeDisquesDurs")
    public String listeDisqueDur(ModelMap modelMap){
        List<DisqueDur> disqueDurs= disquedurService.getAllDDR();
        modelMap.addAttribute("disqueDurs",disqueDurs);
        return "ListeDisqueDur";
    }

    @RequestMapping("/supprimerDisqueDur")
    public String supprimerDisqueDur(@RequestParam("IdDisqueDur") int IdDisqueDur,ModelMap modelMap){
        DisqueDur ddr=new DisqueDur();
        ddr.setIdDisqueDur(IdDisqueDur);
        disquedurService.deleteDDR(ddr);
        List<DisqueDur> disqueDurs=disquedurService.getAllDDR();
        modelMap.addAttribute("DisquesDurs",disqueDurs);
        return "ListeDisqueDur";
    }

    @RequestMapping("/modifierDisqueDur")
    public String editerDisqueDur(@RequestParam("IdDisqueDur") int IdDisqueDur,ModelMap modelMap){
        DisqueDur ddr=disquedurService.getDDR(IdDisqueDur);
        modelMap.addAttribute("disquedur",ddr);
        return "editerProduit";
    }

    public String updateDisqueDur(@ModelAttribute("disqueDur") DisqueDur disqueDur,ModelMap modelMap){
        disquedurService.updateDDR(disqueDur);
        List<DisqueDur>disqueDurs=disquedurService.getAllDDR();
        modelMap.addAttribute("disqueDurs",disqueDurs);
        return "ListeDisqueDur";
    }
}**/
@RestController
@RequestMapping("/apiDisqueDur")
@CrossOrigin(origins = "*")
public class DisqueDurController {
    @Autowired
    DisquedurService disquedurService;

    @RequestMapping(method = RequestMethod.GET)
    public List<DisqueDur> getAllDDR(){
        return disquedurService.getAllDDR();
    }

    @RequestMapping(value = "/{IdDisqueDur}",method = RequestMethod.GET)
    public DisqueDur getDDRById(@PathVariable("IdDisqueDur") int IdDisqueDur){
        return disquedurService.getDDR(IdDisqueDur);
    }

    @RequestMapping(method = RequestMethod.POST)
    public DisqueDur createDDR(@RequestBody DisqueDur disqueDur) {
        return disquedurService.saveDDR(disqueDur);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public DisqueDur updateDDR(@RequestBody DisqueDur disqueDur) {
        return disquedurService.updateDDR(disqueDur);
    }

    @RequestMapping(value="/{IdDisqueDur}",method = RequestMethod.DELETE)
    public void deleteDDR(@PathVariable("IdDisqueDur") int IdDisqueDur) {
        disquedurService.deleteDDRById(IdDisqueDur);
    }
}