package MyFirstTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hrm.pages.HomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class LoginApplicationwithPageObject extends PageObject{

	@Managed	
	WebDriver driver;
	@Steps
	HomePage home;
		@Test
		public void LoginTest() throws InterruptedException {
			driver.get("https://opensource-demo.orangehrmlive.com/");
			home.verifyTitle();
			home.entercredentials();
			home.verifydashboard();
			
		}
}
