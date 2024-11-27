package pe.joedayz.database_relationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joedayz.database_relationships.model.Category;

/**
 * @author josediaz
 **/
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
