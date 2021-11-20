package ejb;

import dao.PlayerDaoI;
import entity.Player;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class PlayerEjb implements PlayerEjbI{

    @Inject
    private PlayerDaoI playerDao;

    @Override
    public Player save(Player player) {
        return playerDao.save(player);
    }

    @Override
    public Player update(Player player) {
        return playerDao.update(player);
    }

    @Override
    public void deleteById(int id) {
        playerDao.deleteById(id);
    }

    @Override
    public Optional<Player> findById(int id) {
        return playerDao.findById(id);
    }

    @Override
    public List<Player> listAll() {
        return playerDao.listAll();
    }
}
