package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {

	protected WebDriver driver;
	By Text = By.cssSelector("#editorial_block_center > h1");
	By clickOnSignIn = By.className("login");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void header() {
		String gethomepagetext = driver.findElement(Text).getText();
		assertEquals("Automation Practice Website", gethomepagetext);
	}
	
	public void clickOnSignIn() {
		driver.findElement(clickOnSignIn).click();
		
	}
}
