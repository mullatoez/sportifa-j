package ejb;

import dao.MatchDaoI;
import entity.Match;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class MatchEjb implements MatchEjbI {

    @Inject
    private MatchDaoI matchDao;

    @Override
    public Match save(Match match) {
        return matchDao.save(match);
    }

    @Override
    public Match update(Match match) {
        return matchDao.update(match);
    }

    @Override
    public List<Match> listAll() {
        return matchDao.listAll();
    }

    @Override
    public Optional<Match> findById(int id) {
        return matchDao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        matchDao.deleteById(id);
    }
}
