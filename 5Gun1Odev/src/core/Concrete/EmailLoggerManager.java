package core.Concrete;

import java.util.Scanner;

import core.Abstract.LoggerService;

public class EmailLoggerManager implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Kullan�c�ya E-mail g�nderildi : " + message);
	}

	@Override
	public boolean emailUserVerification(String email) {//Do�rulama linki metodu
		System.out.println("Kullan�c� ONAYLADI");
		return true;

	}

}
