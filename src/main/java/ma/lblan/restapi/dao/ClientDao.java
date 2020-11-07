package ma.lblan.restapi.dao;

import ma.lblan.restapi.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {
}
