package core.Concrete;

import core.Abstract.VerificationService;
import gmailVerificationService.GmailVerificationManager;

public class GmailVerificationManagerAdapter implements VerificationService{

	@Override
	public boolean emailVerificationSystem(String email) {
		GmailVerificationManager gmailVerificationManager = new GmailVerificationManager();
		return gmailVerificationManager.verificationGmail(email);
		//return false;
	}

}
