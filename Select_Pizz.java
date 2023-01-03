package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Pizz {
	WebDriver driver;
	public Select_Pizz(WebDriver driver){
		this.driver=driver;
	}
	By Select_Pizza_option=By.xpath("//h2[contains(.,'Pizza')]");
	public WebElement  get_Select_Pizza_option() {
		
		return driver.findElement(Select_Pizza_option);
	}
	By Select_Specialty_option=By.xpath("(//img[@alt='Specialty Pizza'])[1]");
	public WebElement get_Select_Specialty_option() {
		return driver.findElement(Select_Specialty_option);
	}

}
