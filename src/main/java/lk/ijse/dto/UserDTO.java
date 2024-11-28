package lk.ijse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int userId;
    private String userName;
    private String role;
    private String password;

    public UserDTO(String userName, String role, String password) {
        this.userName = userName;
        this.role = role;
        this.password = password;
    }
}
