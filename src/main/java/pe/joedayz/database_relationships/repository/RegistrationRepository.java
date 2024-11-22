package pe.joedayz.database_relationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joedayz.database_relationships.model.Registration;

/**
 * @author josediaz
 **/
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
