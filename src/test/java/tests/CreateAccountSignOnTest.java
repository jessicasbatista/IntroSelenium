package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignOutMyAccountPage;

public class CreateAccountSignOnTest {

	private WebDriver driver;
	CreateAccountPage objCreateAccountPage;
	HomePage objHomePage;
	SignOutMyAccountPage objSignOutMyAccountPage;

	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}

	/**
	 * Testando criação de conta e log out
	 * */
	@Test
	public void CreateAccountSignOn() {

		objHomePage = new HomePage(driver);
		objCreateAccountPage = new CreateAccountPage(driver);
		objSignOutMyAccountPage = new SignOutMyAccountPage(driver);
		objHomePage.header();
		objHomePage.clickOnSignIn();
		objCreateAccountPage.enterEmail("jessy@mail.com");
		objCreateAccountPage.clickOnCreateAccount();
		objCreateAccountPage.clickTitle();
		objCreateAccountPage.enterFirstName("Jessica");
		objCreateAccountPage.enterLatName("Batista");
		objCreateAccountPage.enterPassword("selenium");
		objCreateAccountPage.enterDayBirth("1");
		objCreateAccountPage.enterMonthBirth("January");
		objCreateAccountPage.enterYearBirth("2000");
		objCreateAccountPage.enterAddress("Street 01");
		objCreateAccountPage.enterCity("Seattle");
		objCreateAccountPage.enterState("Washington");
		objCreateAccountPage.enterZipCode("99999");
		objCreateAccountPage.enterMobilePhone("99999-9999");
		objCreateAccountPage.clickRegister();

		WebElement validaTexto = driver.findElement(By.cssSelector("ul.myaccount-link-list li a span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());

		objSignOutMyAccountPage.clickOnSignOut();

		WebElement validaTexto2 = driver.findElement(By.className("page-heading"));
		Assert.assertEquals("AUTHENTICATION", validaTexto2.getText());

	}

	@After
	public void afterCenario() {
		driver.quit();

	}

}
