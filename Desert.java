package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Desert {
	
	WebDriver driver;
	public Desert(WebDriver driver) {
		this.driver=driver;
		
	}
	By Select_sewat=By.xpath("//h2[contains(.,'Sweet Treats')]");
	public WebElement  get_Desert() {
		return driver.findElement(Select_sewat);
		
	}
	By Select_Dessert =By.xpath("//h5[contains(text(),'Desserts')]");
	public WebElement get_Select_Dessert() {
		return driver.findElement(Select_Dessert);
	}
	By Select_Penut=By.xpath("(//span[contains(text(),'Add')])[2]");
	public WebElement get_Select_Penut() {
		return driver.findElement(Select_Penut);
	}
	By AddCard_text=By.xpath("//span[@class='NavDesktopCart__shopping-badge GA_cart_Links']");
	public WebElement get_AddCard_text() {
		return driver.findElement(AddCard_text);
	}
	

}
