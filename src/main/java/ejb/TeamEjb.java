package ejb;

import dao.TeamDaoI;
import entity.Team;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class TeamEjb implements TeamEjbI {

    @Inject
    private TeamDaoI teamDao;

    @Override
    public Team save(Team team) {
        return teamDao.save(team);
    }

    @Override
    public void deleteById(int id) {
        teamDao.deleteById(id);
    }

    @Override
    public Team update(Team team) {
        return teamDao.update(team);
    }

    @Override
    public Optional<Team> findById(int id) {
        return teamDao.findById(id);
    }

    @Override
    public List<Team> listAll() {
        return teamDao.listAll();
    }
}
