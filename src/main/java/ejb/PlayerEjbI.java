package ejb;

import entity.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerEjbI {
    Player save(Player player);
    Player update(Player player);
    void deleteById(int id);
    Optional<Player> findById(int id);
    List<Player> listAll();
}
