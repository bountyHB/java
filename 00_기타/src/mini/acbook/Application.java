package mini.acbook;

public class Application {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
//		menu.select();
<<<<<<< HEAD

//		Register register = new Register();
//		register.logIn();
		UserData userData = new UserData();
		
		userData.userList.put("hotba0930","aorwn");
		System.out.println(userData.userList.containsKey("hotba0930"));
		System.out.println(userData.userList.get("hotba0930"));
		System.out.println(userData.userList.get("hotba0930").equals("aorwn"));
=======
	
		Register register = new Register();
		System.out.println(register.getId());
>>>>>>> parent of b605378 (220521)
		
	}
	
}
