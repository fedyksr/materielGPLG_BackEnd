package com.fedy.materiels.controller;

import com.fedy.materiels.models.Scanner;
import com.fedy.materiels.services.scannerServ.ScannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@Controller
public class ScannerController {
    @Autowired
    ScannerService scannerService;

    @RequestMapping("/showCreateScanner")
    public String showCreate()
    {
        return "createScanner";
    }

    @RequestMapping("/saveScanner")
    public String saveScanner(@ModelAttribute("scanner")Scanner scanner, ModelMap modelMap){
        Scanner saveScanner = scannerService.saveScanner(scanner);
        String msg="scanner enregistré avec ID"+saveScanner.getIdScanner();
        modelMap.addAttribute("msg",msg);
        return "createScanner";
    }

    @RequestMapping("/ListeScanner")
    public String listeScanner(ModelMap modelMap){
        List<Scanner> listScanner=scannerService.getAllScanners();
        modelMap.addAttribute("Scanners",listScanner);
        return "listeScanner";
    }

    @RequestMapping("/supprimerScanner")
    public String supprimerScanner(@RequestParam("IdScanner") int IdScanner,ModelMap modelMap){
        Scanner scan=new Scanner();
        scan.setIdScanner(IdScanner);
        scannerService.deleteScanner(scan);
        List<Scanner> listScanner=scannerService.getAllScanners();
        modelMap.addAttribute("Scanners",listScanner);
        return "listeScanners";
    }

    @RequestMapping("/modifierScanner")
    public String editerScanner(@RequestParam("IdScanner") int IdScanner,ModelMap modelMap){
        Scanner scan= scannerService.getScanner(IdScanner);
        modelMap.addAttribute("scanner",scan);
        return "editerScanner";
    }

    @RequestMapping("/updateScanner")
    public String updateScanner(@ModelAttribute("scanner") Scanner scanner,ModelMap modelMap){
        scannerService.updateScanner(scanner);
        List<Scanner> listScanner=scannerService.getAllScanners();
        modelMap.addAttribute("Scanners",listScanner);
        return "listeScanners";
    }
}**/
@RestController
@RequestMapping("/apiScanner")
@CrossOrigin("*")
public class ScannerController {
    @Autowired
    ScannerService scannerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Scanner> getAllProduits() {
        return scannerService.getAllScanners();
    }

    @RequestMapping(value="/{IdScanner}",method = RequestMethod.GET)
    public Scanner getScannerById(@PathVariable("IdScanner") int IdScanner) {
        return scannerService.getScanner(IdScanner);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Scanner createScanner(@RequestBody Scanner scanner) {
        return scannerService.saveScanner(scanner);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Scanner updateScanner(@RequestBody Scanner scanner) {
        return scannerService.updateScanner(scanner);
    }

    @RequestMapping(value="/{IdScanner}",method = RequestMethod.DELETE)
    public void deleteScanner(@PathVariable("IdScanner") int IdScanner)
    {
        scannerService.deleteScannerById(IdScanner);
    }
}