package dataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import entities.Concrete.User;

public class UserDao implements dataAccess.Abstract.UserDao{
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(" kullanýcý eklendi : " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void delete(User user) {
		users.remove(user.getId());
		System.out.println(" kullanýcý silindi : " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void update(User user) {
		
		System.out.println(" kullanýcý güncellendi : " + user.getFirstName() + " " + user.getLastName());
	}
	
	public List<User> getAll(){
		return users;
	}

}
