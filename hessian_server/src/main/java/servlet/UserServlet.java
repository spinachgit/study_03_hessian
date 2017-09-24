package servlet;

import com.caucho.hessian.server.HessianServlet;
import server.UserDTO;
import server.UserService;

/**
 * Created by lepdou on 14-12-19.
 */
public class UserServlet extends HessianServlet implements UserService{
    @Override
    public UserDTO loadUser(int id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("lepdou");
        userDTO.setAge(22);
        return userDTO;
    }
}
