package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericDao<T> implements GenericDaoI<T> {

    @PersistenceContext
    private EntityManager em;

    private Class type;

    public GenericDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T create(T t) {
        this.em.merge(t);
        return t;
    }

    @Override
    public void delete(Object id) {
        this.em.remove(this.em.getReference(type, id));
    }

    @Override
    public T find(Object id) {
        return (T) this.em.find(type, id);
    }

    @Override
    public T update(T t) {
        return this.em.merge(t);
    }

}
