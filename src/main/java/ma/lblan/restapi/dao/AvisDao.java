package ma.lblan.restapi.dao;

import ma.lblan.restapi.entities.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisDao extends JpaRepository<Avis,Long> {
}
