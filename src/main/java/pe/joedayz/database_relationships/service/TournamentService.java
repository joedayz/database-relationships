package pe.joedayz.database_relationships.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joedayz.database_relationships.model.Registration;
import pe.joedayz.database_relationships.model.Tournament;
import pe.joedayz.database_relationships.repository.TournamentRepository;

/**
 * @author josediaz
 **/
@Service
public class TournamentService {

  @Autowired
  TournamentRepository repo;

  public List<Tournament> allTournaments() {
    return repo.findAll();
  }

  public Tournament getTournament(int id){
    return repo.findById(id).get();
  }

  public Tournament addTournament(Tournament tournament) {
    tournament.setId(0);
    return repo.save(tournament);
  }

  public void deleteTournament(int id) {
    repo.deleteById(id);
  }

  public Tournament addRegistration(int id, Registration registration) {
    Tournament tournament = repo.findById(id).get();
    tournament.addRegistration(registration);
    return repo.save(tournament);
  }
}
