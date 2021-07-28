package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutMyAccountPage {
	
	protected WebDriver driver;
	By clickOnSignOut = By.className("logout");

	public SignOutMyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnSignOut() {
		driver.findElement(clickOnSignOut).click();
	}
}
