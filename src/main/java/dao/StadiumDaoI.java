package dao;

import entity.Stadium;

import java.util.List;
import java.util.Optional;

public interface StadiumDaoI {
    Stadium save(Stadium stadium);
    Stadium update(Stadium stadium);
    void deleteById(int id);
    Optional<Stadium> findById(int id);
    List<Stadium> listAll();
}
