package com.fedy.materiels.repositorys;

import com.fedy.materiels.models.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server,Integer> {
}
