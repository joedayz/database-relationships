package pe.joedayz.database_relationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joedayz.database_relationships.model.Tournament;

/**
 * @author josediaz
 **/
@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
