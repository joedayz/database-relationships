package pe.joedayz.database_relationships.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.joedayz.database_relationships.model.Registration;
import pe.joedayz.database_relationships.repository.RegistrationRepository;

/**
 * @author josediaz
 **/
@Service
public class RegistrationService {

  @Autowired
  RegistrationRepository repo;

  public List<Registration> allRegistrations() {
    return repo.findAll();
  }

  public Registration getRegistration(int id){
    return repo.findById(id).get();
  }

  public Registration addRegistration(Registration registration) {
    registration.setId(0);
    return repo.save(registration);
  }

  public void deleteRegistration(int id) {
    repo.deleteById(id);
  }
}
