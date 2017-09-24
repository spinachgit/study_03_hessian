package server;

/**
 * Created by lepdou on 14-12-19.
 */
public class UserServiceImpl implements UserService{
	@Override
	public UserDTO loadUser(int id) {
		 UserDTO userDTO = new UserDTO();
	        userDTO.setName("lepdou");
	        userDTO.setAge(22);
	        return userDTO;
	}
}
