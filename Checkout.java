package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
WebDriver driver;
public Checkout(WebDriver driver) {
	this .driver=driver;
}

By Clickon_Remove=By.xpath("//*[@id='App']/main/div[3]/section/div[1]/div[1]/div[2]/a[2]");
public WebElement get_Clickon_Remove() {
	return driver.findElement(Clickon_Checkout);
}
By Clickon_Checkout =By.xpath("(//a[@data-automation-id='checkoutButton'])[2]");
public WebElement get_Clickon_Checkout() {
	return driver.findElement(Clickon_Checkout);
	
}
By Clickon_Checkout2 =By.xpath("(//a[@data-automation-id='checkoutButton'])[1]");
public WebElement get_Clickon_Checkout2() {
	return driver.findElement(Clickon_Checkout2);
	
}

}
