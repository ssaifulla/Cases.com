package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Redbull {
	WebDriver driver;
	public Select_Redbull(WebDriver driver) {
		this.driver=driver;
	}
	By Select_RedBull =By.xpath("//h3[contains(text(),'Red Bull Energy 20oz')]/parent::a/following-sibling::div/child:"
			+ ":div[@class=\"d-none d-block\"]/descendant::button[@type=\"submit\"]/child::span");
	public WebElement  get_Select_Redbull() {
		return driver.findElement(Select_RedBull);
		
	}
}
