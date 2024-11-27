package pe.joedayz.database_relationships.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "tournament_id")
  private List<Registration> registrations = new ArrayList<>();

  @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
  @JoinTable(
      name = "tournament_categories",
      joinColumns = @JoinColumn(name = "tournament_id"), //fk de la tabla
      inverseJoinColumns = @JoinColumn(name = "category_id")) //fk del lado inverso
  private List<Category> playingCategories = new ArrayList<>();

  public Tournament() {
  }

  public Tournament(int id, String name, String location, List<Registration> registrations) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.registrations = registrations;
  }

  public List<Category> getPlayingCategories() {
    return playingCategories;
  }

  public void setPlayingCategories(
      List<Category> playingCategories) {
    this.playingCategories = playingCategories;
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

  public void removeRegistration(Registration registration) {
    if(registrations!=null)
      registrations.remove(registration);
  }

  public void addCategory(Category category) {
    playingCategories.add(category);
  }


  @Override
  public String toString() {
    return "Tournament{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", location='" + location + '\'' +
        ", registrations=" + registrations +
        ", playingCategories=" + playingCategories +
        '}';
  }

}
