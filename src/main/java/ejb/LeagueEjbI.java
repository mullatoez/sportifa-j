package ejb;

import entity.League;
import util.AppException;

import java.util.List;
import java.util.Optional;

public interface LeagueEjbI {
    League save(League league) throws AppException;

    League update(League league);

    void deleteById(Long id);

    Optional<League> findById(Long id);

    List<League> listAll();
}
