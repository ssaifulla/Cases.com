package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;

import Allobjects.Select_2Pizzas;
import Allobjects.Select_Pizz;
import Allobjects.Selecting_Store;
import Allobjects.iframe_close;

public class Test4 extends Brower_setup {
	ExtentReports extent;
	@Test
	public void testcase2() throws  InterruptedException, IOException {
		Browsers();
		Thread.sleep(4000);
	}
	@Test(priority = 1)
	public void iframes() throws InterruptedException {
		iframe_close frame = new iframe_close(driver);
		Thread.sleep(8000);
		waitforExestence(driver, frame.get_Iframe());
	
		driver.switchTo().frame(frame.get_Iframe());
		Thread.sleep(8000);
		waitforExestence(driver, frame.get_close_frame()).click();

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void Selecting_Store() throws InterruptedException {
		Actions a = new Actions(driver);
		Selecting_Store st = new Selecting_Store(driver);
		
		st.get_Click_Pick().click();
		st.Enter_Location().sendKeys("454 13th St NW, Linton, IN 47441, USA");
		waitforExestence(driver, st.Enter_Location());
		Thread.sleep(2000);
		st.Enter_Location().sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//st.Enter_Location().sendKeys(Keys.ENTER);

		waitforExestence(driver, st.Select_The_Shop()).click();
	
	}

	@Test(priority = 3)
	public void AllProcess() throws InterruptedException {
		Actions a =new Actions(driver);
		Select_Pizz pizza = new Select_Pizz(driver);
		waitforExestence(driver, pizza.get_Select_Pizza_option()).click();
		waitforExestence(driver, pizza.get_Select_Specialty_option()).click();

		Select_2Pizzas select = new Select_2Pizzas(driver);
		waitforExestence(driver, select.get_Select_Customize()).click();
		Thread.sleep(4000);
		//select.get_Select_Customize().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select 1st customise
		a.moveToElement(select.get_Crust_Flavor()).click().build().perform();
	
		select.get_Click_Add_on_Crust_Flavor().click();
		
		//select 2nd customise
		a.moveToElement(select.get_Sauce()).click().build().perform();
		Thread.sleep(2000);
		//a.moveToElement(select.get_Sauce_Select()).click().build().perform();
		//Thread.sleep(4000);
		a.moveToElement(select.get_Sauce_Regular()).click().build().perform();
		Thread.sleep(2000);
		//select 3rd customize
		a.moveToElement(select.get_Cheees()).click().build().perform();
		select.get_Cheees_Select().click();
		select.get_Cheees_Regular().click();
		//Select 4rt Customize
		a.moveToElement(select.get_Meat()).click().build().perform();
		a.moveToElement(select.get_Meat_Pepproni()).click().build().perform();
		select.get_Meat_Pepproni_Regular().click();
		//select 5th customize
		a.moveToElement(select.get_Select_Meatpizza()).click().build().perform();
		select.get_Meat_Sausage_Mild_Regular().click();
		//select 6th Customize
		a.moveToElement(select.get_Sausage_Hot()).click().build().perform();
		select.get_Meat_Sausage_Mild_Regular().click();
		
		
		
		a.moveToElement(select.get_click_Add_Order()).click().build().perform();
		
		
		
	}
	@Test
	public WebElement waitforExestence(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until((ExpectedConditions.visibilityOf(element)));
		return element;
	}
}
