package dao;

import entity.Team;

import java.util.List;
import java.util.Optional;

public interface TeamDaoI {
    //save,deleteById,update,findById
    Team save(Team team);

    void deleteById(int id);

    Team update(Team team);

    Optional<Team> findById(int id);

    List<Team> listAll();

}
