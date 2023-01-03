package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Deals {
	WebDriver driver;
	public Deals(WebDriver driver) {
		this.driver=driver;
		
	}
	By Click_Deals=By.xpath("//a[contains(@title,'Deals')]");
	public WebElement get_Click_Deals() {
		return driver.findElement(Click_Deals);
	}
	By SelectDeal=By.xpath("(//div[@class=\"DealsPage__deal-title\"]/child::strong[contains(.,'2 Large Single Topping Pizzas $9.99 Each')])[2]");
	public WebElement get_SelectDeal() {
		return driver.findElement(SelectDeal);
	}
	By Get_Message =By.xpath("//p[@class='font-weight-normal m-0 pl-sm-6 pl-3']");
	public WebElement get_Get_Message() {
		return driver.findElement(Get_Message);
	}
	By Firstone =By.xpath("(//button[@data-automation-id='addToCartButton'])[1]");
	public WebElement get_Firstone() {
		return driver.findElement(Firstone);
	}
	By Secondone =By.xpath("(//button[@data-automation-id='addToCartButton'])[2]");
	public WebElement get_Secondone() {
		return driver.findElement(Secondone);
	}
	By Deals_Apply =By.xpath("//div[@class=\"CartProductInfo__deal-name col-12\"]/child::span");
	public WebElement get_Deals_Apply() {
		return driver.findElement(Deals_Apply);
	}

}
