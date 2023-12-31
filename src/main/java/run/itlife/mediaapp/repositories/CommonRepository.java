package run.itlife.mediaapp.repositories;

import java.util.Collection;
import java.util.Iterator;

public interface CommonRepository<T> {
    public T save(T entity);
    public Iterable<T> save(Collection<T> entities);
    public void delete(T entity);
    public T findById(String id);
    public Iterable<T> findAll();

}
