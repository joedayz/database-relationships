package pe.joedayz.database_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author josediaz
 **/
@Entity
public class PlayerProfile {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String twitter;

  public PlayerProfile() {
  }

  public PlayerProfile(String twitter) {
    this.twitter = twitter;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  @Override
  public String toString() {
    return "PlayerProfile{" +
        "id=" + id +
        ", twitter='" + twitter + '\'' +
        '}';
  }
}
