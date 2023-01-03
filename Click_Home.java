package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click_Home {
	WebDriver driver;
	
	public  Click_Home(WebDriver driver) {
		this.driver=driver;
	}
	By Click_Menu = By.xpath("//a[@href='/c/menu']");
public WebElement get_Click_Menu() {
	return driver.findElement(Click_Menu);
}
By Click_deals = By.xpath("//a[@href='/c/deals']");
public WebElement get_Click_deals() {
	return driver.findElement(Click_deals);
}


}
