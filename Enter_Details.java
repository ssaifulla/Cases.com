package Allobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Enter_Details {
WebDriver driver;
public Enter_Details(WebDriver driver) {
	this.driver=driver;
}
By Enter_Firstname=By.id("fieldInput1269");

public WebElement get_Enter_Firstname() {
	return driver.findElement(Enter_Firstname);
}
By Enter_Surname= By.id("fieldInput1270");
public WebElement get_Enter_Surname() {
	return driver.findElement(Enter_Surname);
}
By Enter_mailid=By.name("emailaddress");
public WebElement get_Enter_mailid() {
	return driver.findElement(Enter_mailid);
}
By Enter_Phoneno=By.xpath("//input[@name='phone']");
public WebElement get_Enter_Phoneno() {
	return driver.findElement(Enter_Phoneno);
}
By Click_Submit=By.xpath("//button[@type='submit']");
public WebElement get_Click_Submit() {
	return driver.findElement(Click_Submit);
}

}
