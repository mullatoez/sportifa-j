package dao;

import entity.Stadium;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;


public class StadiumDao implements StadiumDaoI {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Stadium save(Stadium stadium) {
        return em.merge(stadium);
    }

    @Override
    public Stadium update(Stadium stadium) {
        stadium = em.merge(stadium);
        return stadium;
    }

    @Override
    public void deleteById(int id) {
        em.remove(em.find(Stadium.class, id));
    }

    @Override
    public Optional<Stadium> findById(int id) {
        Stadium stadium = em.find(Stadium.class, id);
        return stadium != null ? Optional.of(stadium) : Optional.empty();
    }

    @Override
    public List<Stadium> listAll() {
        String query = "SELECT s FROM Stadium s WHERE s.id IS NOT NULL";
        return em.createQuery(query).getResultList();
    }
}
