package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Allobjects.*;

public class Test3 extends Brower_setup {

	@Test
	public void one() throws IOException, InterruptedException {
		Browsers();
		Thread.sleep(4000);

	}

	@Test(priority = 1)
	public void two() throws InterruptedException {
		iframe_close frame = new iframe_close(driver);
		Thread.sleep(4000);
		waitforExestence(driver, frame.get_Iframe());

		driver.switchTo().frame(frame.get_Iframe());
		Thread.sleep(4000);
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
		Thread.sleep(1000);
		 st.Enter_Location().sendKeys(Keys.ENTER); Thread.sleep(2000);
		a.moveToElement(st.Enter_Location()).click();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		//  st.Enter_Location().sendKeys(Keys.ENTER); Thread.sleep(2000);
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
		waitforExestence(driver, select.get_Select_Meatpizza()).click();
		waitforExestence(driver, select.get_Select_anotherpizza()).click();
		driver.navigate().to("https://www.caseys.com/cart");
		Checkout check = new Checkout(driver);
		
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click()", check.get_Clickon_Remove());
		
		//a.moveToElement(check.get_Clickon_Remove()).click();
		//waitforExestence(driver, check.get_Clickon_Remove());
		Thread.sleep(5000);
		//check.get_Clickon_Remove().click();
		//Thread.sleep(3000);
		

		//driver.navigate().to("https://www.caseys.com/cart");

		waitforExestence(driver, check.get_Clickon_Checkout());
		check.get_Clickon_Checkout().click();
		Thread.sleep(2000);
		
		Guest_Checkout and = new Guest_Checkout(driver);
		Thread.sleep(4000);
		waitforExestence(driver, and.get_Click_Guest_Chechout());
		and.get_Click_Guest_Chechout().click();
		

		Enter_Details name = new Enter_Details(driver);
		waitforExestence(driver, name.get_Enter_Firstname());
		name.get_Enter_Firstname().sendKeys("Saifulla");
		name.get_Enter_Surname().sendKeys("Shaik");
		name.get_Enter_mailid().sendKeys("ssaifulla@mail.com");
		name.get_Enter_Phoneno().sendKeys("8247856324");
		name.get_Click_Submit().click();
		

	}

	public WebElement waitforExestence(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until((ExpectedConditions.visibilityOf(element)));
		return element;

	}
}
