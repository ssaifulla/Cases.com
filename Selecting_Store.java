package Allobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selecting_Store {
	WebDriver driver;
	By Click_Pick=By.xpath("//button[contains(@data-automation-id,'carryout')]");
	public Selecting_Store(WebDriver driver) {
		this .driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement get_Click_Pick() {
		return driver.findElement(Click_Pick);
	}
	By Enter_Location=By.xpath("//input[@placeholder='Enter your location']");
	public WebElement Enter_Location() {
		return driver.findElement(Enter_Location);
	}
	 By Select_The_Shop1 =By.xpath("//span[@class='position-relative'][contains(text(),'Start Order')]");
	 By Select_The_Shop =By.xpath("(//span[@class='position-relative'][contains(text(),'Start Order')])[3]");
	 public WebElement Select_The_Shop() {
			return driver.findElement(Select_The_Shop);
		}
	 
	 public WebElement Select_The_Shop1() {
	List<WebElement> ele=driver.findElements(Select_The_Shop);
	WebElement button= null;
	for(WebElement element :ele) {
		System.out.println(element.isEnabled());
		if(element.isEnabled()) {
			button=element;
			break;
		}
	}
	return button;
	 }
}
