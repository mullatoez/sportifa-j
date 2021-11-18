package ejb;

import dao.LeagueDaoI;
import entity.League;
import event.Sms;
import util.AppException;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Stateless
public class LeagueEjb implements LeagueEjbI {

    @PersistenceContext
    private EntityManager em;

    @Inject
    private LeagueDaoI leagueDao;

    @Inject
    private Event<Sms> smsEvent;

    @Override
    public League save(League league) throws AppException {
        if (league == null)
            throw new AppException("League details required");
        league = leagueDao.save(league);
        smsEvent.fire(new Sms("0792", "Hi, welcome"));
        return league;
    }

    @Override
    public League update(League league) {
        return leagueDao.update(league);
    }

    @Override
    public void deleteById(Long id) {
        leagueDao.deleteById(id);
    }

    @Override
    public Optional<League> findById(Long id) {
        return leagueDao.findById(id);
    }

    @Override
    public List<League> listAll() {
        smsEvent.fire(new Sms("0792", "Hi, you listed the leagues"));
        return leagueDao.listAll();
    }
}
