package core.Concrete;

import java.util.Scanner;

import core.Abstract.LoggerService;

public class EmailLoggerManager implements LoggerService{

	@Override
	public void log(String message) {
		System.out.println("Kullanýcýya E-mail gönderildi : " + message);
	}

	@Override
	public boolean emailUserVerification(String email) {//Doðrulama linki metodu
		System.out.println("Kullanýcý ONAYLADI");
		return true;

	}

}
