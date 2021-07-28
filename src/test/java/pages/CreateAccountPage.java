package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

	protected WebDriver driver;
	By emailAdress = By.id("email_create");
	By createAccount = By.id("SubmitCreate");
	By title = By.id("id_gender2");
	By firstName = By.id("customer_firstname");
	By lastName = By.id("customer_lastname");
	By password = By.id("passwd");
	By dayOfBirth = By.id("days");
	By monthOfBirth = By.id("months");
	By yearOfBirth = By.id("years");
	By address = By.id("address1");
	By city = By.id("city");
	By state = By.id("id_state");
	By zipCode = By.id("postcode");
	By mobilePhone = By.id("phone_mobile");
	By register = By.xpath("//span[normalize-space()='Register']");

	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnCreateAccount() {
		driver.findElement(createAccount).click();
	}

	public void enterEmail(String resp) {
		driver.findElement(emailAdress).sendKeys(resp);
	}

	public void clickTitle() {
		driver.findElement(title).click();
	}
	
	public void clickRegister() {
		driver.findElement(register).click();
	}

	public void enterFirstName(String resp) {
		driver.findElement(firstName).sendKeys(resp);
	}

	public void enterLatName(String resp) {
		driver.findElement(lastName).sendKeys(resp);
	}

	public void enterPassword(String resp) {
		driver.findElement(password).sendKeys(resp);
	}

	public void enterDayBirth(String resp) {
		driver.findElement(dayOfBirth).sendKeys(resp);
	}

	public void enterMonthBirth(String resp) {
		driver.findElement(monthOfBirth).sendKeys(resp);
	}

	public void enterYearBirth(String resp) {
		driver.findElement(yearOfBirth).sendKeys(resp);
	}

	public void enterAddress(String resp) {
		driver.findElement(address).sendKeys(resp);
	}

	public void enterCity(String resp) {
		driver.findElement(city).sendKeys(resp);
	}

	public void enterState(String resp) {
		driver.findElement(state).sendKeys(resp);
	}

	public void enterZipCode(String resp) {
		driver.findElement(zipCode).sendKeys(resp);
	}

	public void enterMobilePhone(String resp) {
		driver.findElement(mobilePhone).sendKeys(resp);
	}
}
