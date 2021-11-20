package dao;

import entity.Player;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class PlayerDao implements PlayerDaoI {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Player save(Player player) {
        return em.merge(player);
    }

    @Override
    public Player update(Player player) {
        player = em.merge(player);
        return player;
    }

    @Override
    public void deleteById(int id) {
        em.remove(em.find(Player.class, id));
    }

    @Override
    public Optional<Player> findById(int id) {
        Player player = em.find(Player.class, id);
        return player != null ? Optional.of(player) : Optional.empty();
    }

    @Override
    public List<Player> listAll() {
        String query = "SELECT p FROM Player p WHERE p.id IS NOT NULL";
        return em.createQuery(query, Player.class).getResultList();
    }
}
