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
import pe.joedayz.database_relationships.model.Player;
import pe.joedayz.database_relationships.service.PlayerService;

/**
 * @author josediaz
 **/
@RestController
@RequestMapping("/players")
public class PlayerController {

  @Autowired
  PlayerService service;

  @GetMapping
  public List<Player> allPlayers() {
    return service.allPlayers();
  }

  @GetMapping("/{id}")
  public Player getPlayer(@PathVariable int id){
    return service.getPlayer(id);
  }

  @PostMapping
  public Player addPlayer(@RequestBody Player player) {
    return service.addPlayer(player);
  }

  @DeleteMapping("/{id}")
  public void deletePlayer(@PathVariable int id) {
    service.deletePlayer(id);
  }
}