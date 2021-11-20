package dao;

import entity.Match;

import java.util.List;
import java.util.Optional;

public interface MatchDaoI {
    Match save(Match match);
    Match update(Match match);
    List<Match> listAll();
    Optional<Match> findById(int id);
    void deleteById(int id);
}
