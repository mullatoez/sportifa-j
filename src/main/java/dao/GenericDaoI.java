package dao;


public interface GenericDaoI<T> {
    T create(T t);

    void delete(Object id);

    T find(Object id);

    T update(T t);

}
