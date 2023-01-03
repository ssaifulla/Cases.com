package Allobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_Drinks {
WebDriver driver;
public Select_Drinks(WebDriver driver) {
	this.driver=driver;
}
By Click_Drinks=By.xpath("//h2[contains(text(),'Drinks')]/parent::a[@data-automation-id=\"categoryLink\"]");
public WebElement  get_Click_Drinks() {
	return driver.findElement(Click_Drinks);
}
By Click_Any_Drink_Ctegigory =By.xpath("//h5[contains(text(),'Energy Drinks')]");
public WebElement  get_Click_Any_Drink_Ctegigory() {
	return driver.findElement(Click_Any_Drink_Ctegigory);
	}
}


