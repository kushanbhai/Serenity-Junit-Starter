package hrm.pages;

import org.openqa.selenium.By;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMPage extends PageObject {

	public void VerifyTitle() {
		String title = getDriver().getTitle();
		Assert.assertTrue(title.contains("OrangeHRM"));
	}

	public void enterCredentials() {
		$(By.id("txtUsername")).type("Admin");
		$(By.id("txtPassword")).typeAndEnter("admin123");
	}

	public void VerifyLogin() {
		String currentUrl = getDriver().getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("dashboard"));

	}
}
