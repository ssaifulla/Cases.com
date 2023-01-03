package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframe_close {
	WebDriver driver;
	By  Iframe = By.xpath("//iframe[text()='Your browser does not support iframe']");
	public iframe_close(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement  get_Iframe() {
		return driver.findElement(Iframe);
	}
	
	By close_frame=By.xpath("//span[@class='lightbox_close_toggle']");
	public WebElement get_close_frame() {
		return driver.findElement(close_frame);
	}

}
