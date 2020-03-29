package MyFirstTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LoginTestScenario extends PageObject{

	@Managed	
	WebDriver driver;
		@Test
		public void LoginTest() {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebElementFacade username = $(By.id("txtUsername"));
			username.type("Admin");
			$(By.id("txtPassword")).typeAndEnter("admin123");
			
			
		}
}
