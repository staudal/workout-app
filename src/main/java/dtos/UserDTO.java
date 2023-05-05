package dtos;

import entities.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class UserDTO {
    private String user_name;
    private String user_pass;
    private List<String> roles = new ArrayList<>();

    public UserDTO(String user_name, String user_pass) {
        this.user_name = user_name;
        this.user_pass = user_pass;
    }
    public UserDTO(User user) {
        this.user_name = user.getUserName();
        this.user_pass = user.getUserPass();
        this.roles.add("user");
    }
}
