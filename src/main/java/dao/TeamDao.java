package dao;

import entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class TeamDao implements TeamDaoI{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Team save(Team team) {
        return em.merge(team);
    }

    @Override
    public void deleteById(int id) {
        em.remove(em.find(Team.class,id));
    }

    @Override
    public Team update(Team team) {
        team = em.merge(team);
        return team;
    }

    @Override
    public Optional<Team> findById(int id) {
        Team team = em.find(Team.class,id);
        return team != null ? Optional.of(team) : Optional.empty();
    }

    @Override
    public List<Team> listAll() {
        String query = "SELECT t FROM Team t WHERE  t.id IS NOT NULL";
        return em.createQuery(query).getResultList();
    }
}
