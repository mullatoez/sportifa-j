package ejb;

import entity.Manager;

import java.util.List;
import java.util.Optional;

public interface ManagerEjbI {
    Manager save(Manager manager);

    void deleteById(int id);

    Manager update(Manager manager);

    Optional<Manager> findById(int id);

    List<Manager> listAll();
}
