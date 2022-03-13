package api;

import business.Concrete.UserManager;
import core.Concrete.EmailLoggerManager;
import dataAccess.Concrete.UserDao;
import entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Furkan", "Yağcı", "furkanyagci@gmail.com","123456");//@hotmail.com yaparsan false değer gelir
		UserManager userManager = new UserManager(new UserDao(),new EmailLoggerManager());
		userManager.add(user1);
		
		
		
		User user2 = new User(2, "Ali", "Yağcı", "furkanyagci@gmail.com","123456");
		//userManager.add(user2);
		
		/*for (User user : userManager.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getEmail() + " " + user.getPassword());
		}*/
		
		userManager.login( "furkanyagci@gmail.com", "123456");
	}

}
