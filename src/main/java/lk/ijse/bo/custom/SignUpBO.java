package lk.ijse.bo.custom;

import lk.ijse.bo.SuperBo;
import lk.ijse.dto.UserDTO;

public interface SignUpBO extends SuperBo {
    void saveUser(UserDTO userDTO)throws Exception;
}
