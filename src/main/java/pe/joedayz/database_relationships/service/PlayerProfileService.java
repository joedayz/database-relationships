package pe.joedayz.database_relationships.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joedayz.database_relationships.model.PlayerProfile;
import pe.joedayz.database_relationships.repository.PlayerProfileRepository;

/**
 * @author josediaz
 **/
@Service
public class PlayerProfileService {

  @Autowired
  PlayerProfileRepository repo;

  public List<PlayerProfile> allPlayerProfiles() {
    return repo.findAll();
  }

  public PlayerProfile getPlayerProfile(int id){
    return repo.findById(id).get();
  }

  public PlayerProfile addPlayerProfile(PlayerProfile profile) {
    profile.setId(0);
    return repo.save(profile);
  }

  //delete profile
  public void deletePlayerProfile(int id) {
    PlayerProfile tempPlayerProfile = repo.findById(id).get();

    tempPlayerProfile.getPlayer().setPlayerProfile(null);

    tempPlayerProfile.setPlayer(null);

    repo.save(tempPlayerProfile);

    repo.delete(tempPlayerProfile);
  }


}