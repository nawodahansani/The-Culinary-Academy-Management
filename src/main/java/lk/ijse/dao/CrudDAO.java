package lk.ijse.dao;

import lk.ijse.entity.User;

import java.util.List;

public interface CrudDAO <T> extends SuperDAO{
    void save(T x) throws Exception;
    void update(T x) throws Exception;
    List<T> getAll() throws Exception;

}
