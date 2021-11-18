package dao;

import entity.League;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;


public class LeagueDao implements LeagueDaoI{

    @PersistenceContext
    private EntityManager em;

    @Override
    public League save(League league) {
        return em.merge(league);
    }

    @Override
    public League update(League league) {
        league = em.merge(league);
        return league;
    }

    @Override
    public void deleteById(Long id) {
        em.remove(em.find(League.class,id));
    }

    @Override
    public Optional<League> findById(Long id) {
        League league = em.find(League.class,id);
        return league != null ? Optional.of(league) : Optional.empty();
    }

    @Override
    public List<League> listAll() {

        String query = "SELECT l FROM League WHERE l.id IS NOT NULL";
        return em.createQuery(query).getResultList();
    }
}
