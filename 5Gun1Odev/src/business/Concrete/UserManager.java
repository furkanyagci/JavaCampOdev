package business.Concrete;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.Abstract.UserService;
import core.Abstract.LoggerService;
import core.Concrete.GmailVerificationManagerAdapter;
import dataAccess.Abstract.UserDao;
import entities.Concrete.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private LoggerService loggers;
	
	public UserManager(UserDao userDao, LoggerService loggerService) {
		this.userDao = userDao;
		this.loggers = loggerService;
	}
	
	@Override
	public void add(User user) {
		//boolean result = gmailVerificationServiceControl(user.getEmail());
		//System.out.println(result);
		if(userInformationNotEmpty(user) && userInformationCharacterLength(user) && gmailFormatControl(user.getEmail()) && gmailVerificationServiceControl(user.getEmail()) && userEmailRegistered(user)) {
			loggers.log("Sisteme kayd?n?z tamalanmak ?zere l?tfen onay Linkine t?klay?n?z.");
			if (loggers.emailUserVerification(user.getEmail())) {
				
				loggers.log("?yelik i?leminiz ba?ar?yla tamamland?.");//Kullan?c?ya mesaj g?nderiyoruz.
				this.userDao.add(user);
				
			} else {
				
				loggers.log("?yelik i?lemi ba?ar?s?z");//Kullan?c?ya mesaj g?nderiyoruz.
				
			}
			
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String email, String password) {
		boolean control=false;
		for (User userr : userDao.getAll()) {
			if(userr.getEmail() == email && userr.getPassword() == password ) {
				control=true;
				break;
			}
		}
		if (control) {
			System.out.println("Bigiler do?ru sisteme giri? yap?ld?");
		}else {
			System.out.println("Bigiler yanl?? sisteme giri? yap?lmad? !");
		}
		
	}
	
	public List<User> getAll(){
		return userDao.getAll();
	}
	
	boolean userInformationNotEmpty(User user) {
		if (!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}else {
			System.out.println("L?tfen istenilen bilgileri giriniz.");
			return false;
		}
	}
	
	boolean userInformationCharacterLength(User user) {
		if (user.getPassword().length()>=6 && user.getFirstName().length() > 1 && user.getLastName().length() > 1) {
			return true;
		}else {
			System.out.println("Ad ve soyad en az 2 karakter olmal?. ?ifre en az 6 karakter olabilir.");
			return false;
		}
	}
	
	boolean userEmailRegistered(User user) {
		boolean emailControl = false;
		
		for (User userr : this.userDao.getAll()) {
			if(userr.getEmail() == user.getEmail()) {
				emailControl = true;
			}
		}
		
		if(emailControl) {
			System.out.println("Bu E-mail ile sisteme daha kay?t olunmu?");
			return false;
		}else {
			return true;
		}
	}
	
	boolean gmailFormatControl(String email) {
		
		Pattern pattern = Pattern.compile(".@gmail.com");//nokta ?ncesi ne olursa olsun demek. Gelen veri i?inde aranacak de?eri pattern nesnesi tutacak
		Matcher matcher = pattern.matcher(email);//Bulmak i?in Matcher(kar??la?t?r?c?) kullan?yoruz.
		if (matcher.find()) {
			return true;
		}else {
			System.out.println("Sisteme gmail ile ?ye olunabilir.");
			return false;
		}
	}
	
	boolean gmailVerificationServiceControl(String email) {
		GmailVerificationManagerAdapter gmailVerificationManagerAdapter = new GmailVerificationManagerAdapter();
		boolean result = gmailVerificationManagerAdapter.emailVerificationSystem(email);
		if (result) {
			//System.out.println("Gmail do?rulama servisi gmail'i do?rulad?");
			return true;
		} else {
			//System.out.println("Gmail do?rulama gmail'i do?rulamad? ! ");
			return false;
		}
	}
	
}
