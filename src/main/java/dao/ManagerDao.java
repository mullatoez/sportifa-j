package dao;

import entity.Manager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class ManagerDao implements ManagerDaoI {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Manager save(Manager manager) {
        return em.merge(manager);
    }

    @Override
    public void deleteById(int id) {

        em.remove(em.find(Manager.class, id));
    }

    @Override
    public Manager update(Manager manager) {
        manager = em.merge(manager);
        return manager;
    }

    @Override
    public Optional<Manager> findById(int id) {
        Manager manager = em.find(Manager.class, id);
        return manager != null ? Optional.of(manager) : Optional.empty();
    }

    @Override
    public List<Manager> listAll() {
        String query = "SELECT m FROM Manager m WHERE m.id IS NOT NULL";
        return em.createQuery(query).getResultList();
    }
}
