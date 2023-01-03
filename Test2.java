package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Allobjects.Checkout;
import Allobjects.Deals;
import Allobjects.Enter_Details;
import Allobjects.Guest_Checkout;
import Allobjects.Selecting_Store;
import Allobjects.iframe_close;

public class Test2 extends Brower_setup {
	
	
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
		st.Enter_Location().sendKeys(Keys.ENTER);

		waitforExestence(driver, st.Select_The_Shop()).click();

		/*
		 * a.moveToElement(st.Select_The_Shop1()).build().perform();
		 * st.Select_The_Shop1().click(); Thread.sleep(40000);
		 */ // waitforExestence(driver,st.Select_The_Shop()); st.Select_The_Shop().click();

	}
@Test(priority=3)
	public void All_Process() throws InterruptedException {
		Deals deals = new Deals(driver);
		deals.get_Click_Deals().click();
		Thread.sleep(4000);
		waitforExestence(driver,deals.get_SelectDeal()).click();
		Thread.sleep(2000);
		waitforExestence(driver,deals.get_Firstone()).click();
		Thread.sleep(2000);
		waitforExestence(driver,deals.get_Secondone()).click();
		Thread.sleep(2000);

		driver.navigate().to("https://www.caseys.com/cart");
		Thread.sleep(2000);
		Checkout check = new Checkout(driver);
		waitforExestence(driver, check.get_Clickon_Checkout());
		Thread.sleep(2000);
		check.get_Clickon_Checkout().click();

		Guest_Checkout and = new Guest_Checkout(driver);
		Thread.sleep(2000);
		waitforExestence(driver, and.get_Click_Guest_Chechout());
		and.get_Click_Guest_Chechout().click();

		Enter_Details name = new Enter_Details(driver);
		waitforExestence(driver, name.get_Enter_Firstname());
		name.get_Enter_Firstname().sendKeys("Saifulla");
		name.get_Enter_Surname().sendKeys("Shaik");
		name.get_Enter_mailid().sendKeys("ssaifulla@mail.com");
		name.get_Enter_Phoneno().sendKeys("8247856324");
		name.get_Click_Submit().click();
		
	String Deals_Text=deals.get_Deals_Apply().getText();
	
	System.out.println(Deals_Text);
	String Expected_Test="Pepperoni, Sausage, Cheese, or your favorite!";
	Assert.assertEquals("Pepperoni, Sausage, Cheese, or your favorite!", Deals_Text);
	if(Expected_Test==Deals_Text)
	{
		System.out.println("Deals are applied the name of the deal is :"+" "+ Deals_Text);
	}
	Assert.assertEquals(true, true);
		
		
	}
@Test(priority=4)
public void close_browser() {
	driver.quit();
}

@Test
	public WebElement waitforExestence(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until((ExpectedConditions.visibilityOf(element)));
		return element;
	}
}
