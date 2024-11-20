package pe.joedayz.database_relationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joedayz.database_relationships.model.Player;

/**
 * @author josediaz
 **/
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}