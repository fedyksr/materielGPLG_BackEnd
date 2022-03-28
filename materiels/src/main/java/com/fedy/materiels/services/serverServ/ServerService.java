package com.fedy.materiels.services.serverServ;

import com.fedy.materiels.models.Scanner;
import com.fedy.materiels.models.Server;

import java.util.List;

public interface ServerService {
    Server saveServer(Server server);
    Server updateServer(Server server);
    void deleteServer(Server server);
    void deleteServerById(int IdServer);
    Server getServer(int IdServer);
    List<Server> getAllServers();
}
