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
import pe.joedayz.database_relationships.model.Registration;
import pe.joedayz.database_relationships.service.RegistrationService;

/**
 * @author josediaz
 **/
@RestController
@RequestMapping("/registrations")
public class RegistrationController {

  @Autowired
  RegistrationService service;

  @GetMapping
  public List<Registration> allRegistrations() {
    return service.allRegistrations();
  }

  @GetMapping("/{id}")
  public Registration getRegistration(@PathVariable int id){
    return service.getRegistration(id);
  }

  @PostMapping
  public Registration addRegistration(@RequestBody Registration registration) {
    return service.addRegistration(registration);
  }

  @DeleteMapping("/{id}")
  public void deleteRegistration(@PathVariable int id) {
    service.deleteRegistration(id);
  }
}
