package ejb;

import dao.StadiumDaoI;
import entity.Stadium;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class StadiumEjb implements StadiumEjbI {

    @Inject
    private StadiumDaoI stadiumDao;

    @Override
    public Stadium save(Stadium stadium) {
        return stadiumDao.save(stadium);
    }

    @Override
    public Stadium update(Stadium stadium) {
        return stadiumDao.update(stadium);
    }

    @Override
    public void deleteById(int id) {
        stadiumDao.deleteById(id);
    }

    @Override
    public Optional<Stadium> findById(int id) {
        return stadiumDao.findById(id);
    }

    @Override
    public List<Stadium> listAll() {
        return stadiumDao.listAll();
    }
}
