package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBo;
import lk.ijse.dto.UserDTO;

public interface SignInBO extends SuperBo {
    UserDTO getUser(String userName)throws Exception;
}
