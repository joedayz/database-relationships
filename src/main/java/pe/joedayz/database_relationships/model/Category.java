package pe.joedayz.database_relationships.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author josediaz
 **/
@Entity
public class Category {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;

  @Column(unique=true)
  private String name;

  public Category() {
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

  @Override
  public String toString() {
    return "Category [id=" + id + ", name=" + name + "]";
  }
}
