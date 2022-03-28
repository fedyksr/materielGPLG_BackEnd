package com.fedy.materiels.services.serverServ;

import com.fedy.materiels.models.Scanner;
import com.fedy.materiels.models.Server;
import com.fedy.materiels.repositorys.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServerServiceImpl implements ServerService{

    @Autowired
    ServerRepo serverRepo;

    @Override
    public Server saveServer(Server server) {
        return serverRepo.save(server);
    }

    @Override
    public Server updateServer(Server server) {
        return serverRepo.save(server);
    }

    @Override
    public void deleteServer(Server server) {
        serverRepo.delete(server);
    }

    @Override
    public void deleteServerById(int IdServer) {
        serverRepo.deleteById(IdServer);
    }

    @Override
    public Server getServer(int IdServer) {
        return serverRepo.findById(IdServer).orElse(null);
    }

    @Override
    public List<Server> getAllServers() {
        List<Server> listServer=serverRepo.findAll();
        return listServer;
    }
}
