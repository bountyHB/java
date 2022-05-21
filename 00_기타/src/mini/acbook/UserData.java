package mini.acbook;

import java.util.HashMap;

public class UserData {
	
	public HashMap<String, User> userList = new HashMap<>();
	public void userListSet() {
		userList.put("1", new User("1", "1"));
		userList.put("2", new User("2", "2"));
		userList.put("3", new User("3", "3"));
	}
}
