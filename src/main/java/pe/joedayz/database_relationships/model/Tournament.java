package pe.joedayz.database_relationships.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author josediaz
 **/
@Entity
public class Tournament {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  private String location;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "tournament_id")
  private List<Registration> registrations = new ArrayList<>();


  public Tournament() {
  }

  public Tournament(int id, String name, String location, List<Registration> registrations) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.registrations = registrations;
  }

  public void addRegistration(Registration registration) {
    registrations.add(registration);
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

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Tournament{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", location='" + location + '\'' +
        ", registrations=" + registrations +
        '}';
  }
}
