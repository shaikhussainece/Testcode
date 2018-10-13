

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {

	WebDriver driver;
	By logout = By.linkText("Log Out");

	public LogOut(WebDriver driver) {

		this.driver = driver;

	}

	public void clickOnLogOut() {
		driver.findElement(logout).click();
	}

}
