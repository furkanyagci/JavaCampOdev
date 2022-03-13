package core.Concrete;

import java.util.Scanner;

import core.Abstract.LoggerService;

public class EmailLoggerManager implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Kullanıcıya E-mail gönderildi : " + message);
	}

	@Override
	public boolean emailUserVerification(String email) {//Doğrulama linki metodu
		System.out.println("Kullanıcı ONAYLADI");
		return true;

	}

}
