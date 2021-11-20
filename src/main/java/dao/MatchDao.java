package dao;

import entity.Match;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class MatchDao implements MatchDaoI {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Match save(Match match) {
        return em.merge(match);
    }

    @Override
    public Match update(Match match) {
        match = em.merge(match);
        return match;
    }

    @Override
    public List<Match> listAll() {
        String query = "SELECT m FROM Match m WHERE m.id IS NOT NULL";
        return em.createQuery(query, Match.class).getResultList();
    }

    @Override
    public Optional<Match> findById(int id) {
        Match match = em.find(Match.class, id);
        return match != null ? Optional.of(match) : Optional.empty();
    }

    @Override
    public void deleteById(int id) {
        em.remove(em.find(Match.class, id));
    }
}
