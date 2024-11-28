package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.SettingBO;
import lk.ijse.dao.DAOFactory;
import lk.ijse.dao.custom.UserDAO;
import lk.ijse.dto.UserDTO;
import lk.ijse.entity.User;

import java.util.ArrayList;
import java.util.List;

public class SettingBOImpl implements SettingBO {
    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.USER);

    public List<UserDTO> getAllUser() throws Exception {
        List<User> users = userDAO.getAll();
        List<UserDTO> userDTOS = new ArrayList<>();

        for (User user : users){
            UserDTO userDTO = new UserDTO(user.getUserId(), user.getUserName(), user.getRole(), user.getPassword());
            userDTOS.add(userDTO);
        }
        return userDTOS;
    }
    public void updateUser(UserDTO userDTO) throws Exception {
       User user = new User(userDTO.getUserId(),userDTO.getUserName(), userDTO.getRole(), userDTO.getPassword());
       userDAO.update(user);
    }
}
