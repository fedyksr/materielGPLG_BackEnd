package com.fedy.materiels.controller;

import com.fedy.materiels.models.Server;
import com.fedy.materiels.services.serverServ.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiServer")
@CrossOrigin(origins = "*")
public class ServerController {
    @Autowired
    ServerService serverService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Server> getAllServers(){
        return serverService.getAllServers();
    }

    @RequestMapping(value="/{IdServer}",method = RequestMethod.GET)
    public Server getServerById(@PathVariable("IdServer") int IdServer){
        return serverService.getServer(IdServer);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Server createServer(@RequestBody Server server){
        return serverService.saveServer(server);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Server updateServer(@RequestBody Server server){
        return serverService.updateServer(server);
    }
    @RequestMapping(value="/{IdServer}",method = RequestMethod.DELETE)
    public void deleteServer(@PathVariable("IdServer") int IdServer){
        serverService.deleteServerById(IdServer);
    }
}
/**public class ServerController {
    @Autowired
    ServerService serverService;

    @RequestMapping("/showCreateServer")
    public String showCreate()
    {
        return "createServer";
    }

    @RequestMapping("/saveServer")
    public String saveServer(@ModelAttribute("server") Server server, ModelMap modelMap){
        Server saveServer = serverService.saveServer(server);
        String msg="server enregistré avec ID "+saveServer.getIdServer();
        modelMap.addAttribute("msg",msg);
        return "createServer";
    }

    @RequestMapping("/ListeServer")
    public String listeServers(ModelMap modelMap){
        List<Server> listServer=serverService.getAllServers();
        modelMap.addAttribute("servers",listServer);
        return "listeServers";
    }

    @RequestMapping("/supprimerServer")
    public String supprimerServer(@RequestParam("IdScanner") int IdScanner,ModelMap modelMap){
        Server server= new Server();
        server.setIdServer(IdScanner);
        serverService.deleteServer(server);
        List<Server> listServer=serverService.getAllServers();
        modelMap.addAttribute("servers",listServer);
        return "listeServers";
    }

    @RequestMapping("/modifierServer")
    public String editerServer(@RequestParam("IdScanner") int IdScanner,ModelMap modelMap){
        Server server=serverService.getServer(IdScanner);
        modelMap.addAttribute("server",server);
        return "editerServer";
    }

    @RequestMapping("/updateServer")
    public String updateServer(@ModelAttribute("server") Server server, ModelMap modelMap){
        serverService.updateServer(server);
        List<Server>listServer=serverService.getAllServers();
        modelMap.addAttribute("servers",listServer);
        return "listeServers";
    }
}**/
