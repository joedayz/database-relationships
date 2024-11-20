package pe.joedayz.database_relationships.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.joedayz.database_relationships.model.PlayerProfile;
import pe.joedayz.database_relationships.service.PlayerProfileService;

/**
 * @author josediaz
 **/
@RestController
@RequestMapping("/profiles")
public class PlayerProfileController {

  @Autowired
  PlayerProfileService service;

  @GetMapping
  public List<PlayerProfile> allPlayerProfiles() {
    return service.allPlayerProfiles();
  }

  @GetMapping("/{id}")
  public PlayerProfile getPlayerProfile(@PathVariable int id){
    return service.getPlayerProfile(id);
  }

  @PostMapping
  public PlayerProfile addPlayerProfile(@RequestBody PlayerProfile playerProfile) {
    return service.addPlayerProfile(playerProfile);
  }

  @DeleteMapping("/{id}")
  public void deletePlayerProfile(@PathVariable int id) {
    service.deletePlayerProfile(id);
  }
}