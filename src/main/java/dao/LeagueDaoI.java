package dao;

import entity.League;

import java.util.List;
import java.util.Optional;

public interface LeagueDaoI {
    League save(League league);

    League update(League league);

    void deleteById(Long id);

    Optional<League> findById(Long id);

    List<League> listAll();
}
