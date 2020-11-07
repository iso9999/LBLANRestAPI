package ma.lblan.restapi.dao;

import ma.lblan.restapi.entities.Poste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosteDao extends JpaRepository<Poste, Long> {
}
