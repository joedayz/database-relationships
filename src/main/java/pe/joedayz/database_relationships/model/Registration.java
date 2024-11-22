package pe.joedayz.database_relationships.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author josediaz
 **/
@Entity
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  public Registration() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Registration{" +
        "id=" + id +
        '}';
  }
}
