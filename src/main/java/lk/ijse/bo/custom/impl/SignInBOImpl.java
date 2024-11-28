package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.SignInBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.dto.UserDTO;
import lk.ijse.entity.User;

public class SignInBOImpl implements SignInBO {
    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.USER);
    @Override
    public UserDTO getUser(String userName)throws Exception{
        User user = userDAO.getUser(userName);
        return new UserDTO(user.getUserId(),user.getUserName(),user.getRole(),user.getPassword());
    }
}
