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
import pe.joedayz.database_relationships.model.Category;
import pe.joedayz.database_relationships.service.CategoryService;

/**
 * @author josediaz
 **/
@RestController
@RequestMapping("/categories")
public class CategoryController {

  @Autowired
  CategoryService service;

  @GetMapping
  public List<Category> allCategories() {
    return service.allCategories();
  }

  @GetMapping("/{id}")
  public Category getCategory(@PathVariable int id) {
    return service.getCategory(id);
  }

  @PostMapping
  public Category addCategory(@RequestBody Category category) {
    return service.addCategory(category);
  }

  @DeleteMapping("/{id}")
  public void deleteCategory(@PathVariable int id) {
    service.deleteCategory(id);
  }
}
