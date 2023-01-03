package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guest_Checkout {
	WebDriver driver;
	public Guest_Checkout(WebDriver driver) {
		this.driver=driver;
	}
	By Click_Guest_Chechout =By.xpath("//a[contains(text(),'Guest Checkout')]");
	public WebElement get_Click_Guest_Chechout() {
		return driver.findElement(Click_Guest_Chechout);
	}
	

}
