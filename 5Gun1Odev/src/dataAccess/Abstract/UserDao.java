package dataAccess.Abstract;

import java.util.List;

import entities.Concrete.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	public List<User> getAll();
}
