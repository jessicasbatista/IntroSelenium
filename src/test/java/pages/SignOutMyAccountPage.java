package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutMyAccountPage {
	
	protected WebDriver driver;
//	By Text = By.cssSelector("ul.myaccount-link-list li a span");
	By clickOnSignOut = By.className("logout");

	public SignOutMyAccountPage(WebDriver driver) {
		this.driver = driver;
	}

//	public void MyAccount() {
//		String getmyaccounttext = driver.findElement(Text).getText();
//		assertEquals("ORDER HISTORY AND DETAILS", getmyaccounttext);
//	}
	
	public void clickOnSignOut() {
		driver.findElement(clickOnSignOut).click();
		
	}
	

}
