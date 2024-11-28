package lk.ijse.dao.custom;

import lk.ijse.dao.CrudDAO;
import lk.ijse.dao.SuperDAO;
import lk.ijse.entity.User;

import java.util.List;

public interface UserDAO extends CrudDAO<User> {
    User getUser(String userName) throws Exception;
}
