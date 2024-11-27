package pe.joedayz.database_relationships.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * @author josediaz
 **/
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  @OneToOne(cascade = CascadeType.ALL, optional = false)
  @JoinColumn(name = "profile_id", referencedColumnName = "id")
  private PlayerProfile playerProfile;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "player")
  private List<Registration> registrations = new ArrayList<>();

  public Player( ) {

  }

  public Player(String name) {
    super();
    this.name = name;
  }

  public Player(String name, PlayerProfile profile) {
    super();
    this.name = name;
    this.playerProfile = profile;
  }

  public List<Registration> getRegistrations() {
    return registrations;
  }

  public void setRegistrations(
      List<Registration> registrations) {
    this.registrations = registrations;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayerProfile getPlayerProfile() {
    return playerProfile;
  }

  public void setPlayerProfile(PlayerProfile playerProfile) {
    this.playerProfile = playerProfile;
  }

  public void registerPlayer(Registration registration) {
    registrations.add(registration);
    registration.setPlayer(this);
  }


  @Override
  public String toString() {
    return "Player{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", playerProfile=" + playerProfile +
        ", registrations=" + registrations +
        '}';
  }
}
