package ma.lblan.restapi.dao;

import ma.lblan.restapi.entities.Prestataire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestataireDao extends JpaRepository<Prestataire, Long> {
}
