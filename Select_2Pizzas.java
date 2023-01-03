package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_2Pizzas {
WebDriver driver;
	public Select_2Pizzas(WebDriver driver) {
		this.driver=driver;
	}
	
	By Select_Meatpizza=By.xpath("//h3[contains(text(),'Meat Galore Pizza')]/parent::a/preceding::span[text()=' Add '][1]");
	
	public WebElement  get_Select_Meatpizza() {
		return driver.findElement(Select_Meatpizza);
	}
	By Select_anotherpizza=By.xpath("(//span[text()=' Add '])[2]");
	public WebElement get_Select_anotherpizza() {
		return driver.findElement(Select_anotherpizza);
	}
	
	
	By Select_Customize=By.xpath("(//button[@data-automation-id='customizeButton'])[2]");
	public WebElement get_Select_Customize() {
		return driver.findElement(Select_Customize);
	}By Crust_Flavor =By.xpath("//label[@data-automation-id='accordionTabLabel'][contains(text(),'Crust flavor')]");
	public WebElement get_Crust_Flavor() {
		return driver.findElement(Crust_Flavor);
	}
	By click_Add_on_Garlic =By.xpath("(//button[@data-automation-id='addToppingButton'][contains(text(),'Add')])[1]");
	public WebElement get_Click_Add_on_Crust_Flavor() {
		return driver.findElement(click_Add_on_Garlic);
	}
	
	//SAUCE
	By Sauce =By.xpath("//label[contains(text(),'Sauce')]");
	public WebElement get_Sauce() {
		return driver.findElement(Sauce);
	}
	By Sauce_Select =By.xpath("(//button[contains(text(),'Select')])[1]");
	public WebElement get_Sauce_Select() {
		return driver.findElement(Sauce_Select);
	}By Sauce_Regular =By.xpath("//label[contains(text(),'Sauce')]/following-sibling::div/child::div/child::div/child::div/child::div/child::button[1]/parent::div/parent::div/following-sibling::div/child::div/child::label/child::span[contains(.,'Light')]");
	public WebElement get_Sauce_Regular() {
		return driver.findElement(Sauce_Regular);
	}
	
	
	//
	
	
	By Cheees =By.xpath("//label[contains(text(),'Cheese')]");
	public WebElement get_Cheees() {
		return driver.findElement(Cheees);
	}
	By Cheees_Select =By.xpath("(//button[contains(text(),'Select')])[2]");
	public WebElement get_Cheees_Select() {
		return driver.findElement(Cheees_Select);
	}
	By Cheees_Regular =By.xpath("(//span[@class='PdpCustomizerTopping__portion-text'])[5]");
	public WebElement get_Cheees_Regular() {
		return driver.findElement(Cheees_Regular);
	}
	
	
	
	
	By Meat =By.xpath("//label[contains(text(),'Meats')]");
	public WebElement get_Meat() {
		return driver.findElement(Meat);
	}By Meat_Pepproni =By.xpath("(//button[@data-automation-id='addToppingButton'][contains(text(),'Add')])[2]");
	public WebElement get_Meat_Pepproni() {
		return driver.findElement(Meat_Pepproni);
	}
	By Meat_Pepproni_Regular =By.xpath("(//span[@class='PdpCustomizerTopping__portion-text'])[8]");
	public WebElement get_Meat_Pepproni_Regular() {
		return driver.findElement(Meat_Pepproni_Regular);
	}
	
	
	
	
	By Sausage_Mild =By.xpath("//div[contains(text(),'Sausage-Mild')]");
	public WebElement get_Sausage_Mild() {
		return driver.findElement(Sausage_Mild);
	}
	By Meat_Sausage_Mild_Regular =By.xpath("(//span[@class='PdpCustomizerTopping__portion-text'])[11]");
	public WebElement get_Meat_Sausage_Mild_Regular() {
		return driver.findElement(Meat_Pepproni_Regular);
	}
	By Sausage_Hot =By.xpath("//div[contains(text(),'Sausage-Hot')]");
	public WebElement get_Sausage_Hot() {
		return driver.findElement(Sausage_Hot);
	}
	By Meat_Sausage_Hot_Regular =By.xpath("(//span[@class='PdpCustomizerTopping__portion-text'])[14]");
	public WebElement get_Sausage_Hot_Regular() {
		return driver.findElement(Meat_Sausage_Hot_Regular);
	}
	
	
	
	By click_Add_Order =By.xpath("(//button[contains(.,'Add to Order')])[1]");
	public WebElement get_click_Add_Order() {
		return driver.findElement(click_Add_Order);
	}
	
	
}
