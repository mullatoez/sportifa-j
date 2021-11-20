package ejb;

import dao.ManagerDaoI;
import entity.Manager;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateless
public class ManagerEjb implements ManagerEjbI {

    @Inject
    private ManagerDaoI managerDao;

    @Override
    public Manager save(Manager manager) {
        return managerDao.save(manager);
    }

    @Override
    public void deleteById(int id) {
        managerDao.deleteById(id);
    }

    @Override
    public Manager update(Manager manager) {
        return managerDao.update(manager);
    }

    @Override
    public Optional<Manager> findById(int id) {
        return managerDao.findById(id);
    }

    @Override
    public List<Manager> listAll() {
        return managerDao.listAll();
    }
}
