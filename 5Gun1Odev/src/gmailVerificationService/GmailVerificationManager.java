package gmailVerificationService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailVerificationManager {
	public boolean verificationGmail(String gmail) {
		if(gmail.length()>14) {
	
			Pattern pattern = Pattern.compile(".@gmail.com");//nokta ?ncesi ne olursa olsun demek. Gelen veri i?inde aranacak de?eri pattern nesnesi tutacak
			Matcher matcher = pattern.matcher(gmail);//Bulmak i?in Matcher(kar??la?t?r?c?) kullan?yoruz.
			if (matcher.find()) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
}
