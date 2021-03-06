package business.Abstract;

import java.util.List;

import entities.Concrete.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	void login(String email, String password);
	public List<User> getAll();
}
