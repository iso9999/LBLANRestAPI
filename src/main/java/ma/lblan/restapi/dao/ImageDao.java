package ma.lblan.restapi.dao;

import ma.lblan.restapi.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image,Long> {
}
