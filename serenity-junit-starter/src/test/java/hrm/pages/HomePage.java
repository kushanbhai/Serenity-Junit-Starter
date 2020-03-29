package hrm.pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

	OrangeHRMPage home;

	@Step("This method will verify the title")
	public void verifyTitle() {
		home.VerifyTitle();
	}

	@Step("This method will enter the credentials and login to application")
	public void entercredentials() {
		home.enterCredentials();
	}

	@Step("This method will verify the dashboard")
	public void verifydashboard() {
		home.VerifyLogin();
	}
}
