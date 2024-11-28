package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.SignUpBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.dto.UserDTO;
import lk.ijse.entity.User;

public class SignUpBOImpl implements SignUpBO {
    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.USER);
    @Override
    public void saveUser(UserDTO userDTO)throws Exception{
        User user = new User(userDTO.getUserName(), userDTO.getRole(), userDTO.getPassword());
        userDAO.save(user);
    }
}
