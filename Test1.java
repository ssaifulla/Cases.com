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
import Allobjects.Click_Home;
import Allobjects.Desert;
import Allobjects.Enter_Details;
import Allobjects.Guest_Checkout;
import Allobjects.Select_2Pizzas;
import Allobjects.Select_Drinks;
import Allobjects.Select_Pizz;
import Allobjects.Select_Redbull;
import Allobjects.Selecting_Store;
import Allobjects.iframe_close;

public class Test1 extends Brower_setup {


	
	@Test(priority = 1)
	public void T() throws IOException, InterruptedException {
		Browsers();

		Thread.sleep(8000);
	}

	@Test(priority = 2)
	public void iframes() throws InterruptedException {
		iframe_close frame = new iframe_close(driver);
		waitforExestence(driver, frame.get_Iframe());
		driver.switchTo().frame(frame.get_Iframe());
		Thread.sleep(8000);
		waitforExestence(driver, frame.get_close_frame()).click();

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void Selecting_Store() throws InterruptedException {
		Actions a =new Actions(driver);
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
		 */		 // waitforExestence(driver,st.Select_The_Shop()); st.Select_The_Shop().click();
		 
	}

	@Test(priority = 4)
	public void Select_Pizza_option() throws InterruptedException {
		Select_Pizz pizza = new Select_Pizz(driver);
		waitforExestence(driver,pizza.get_Select_Pizza_option()).click();
		Thread.sleep(2000);
		waitforExestence(driver, pizza.get_Select_Specialty_option()).click();
	}

	@Test(priority = 5)
	public void Select_2Pizzas() throws InterruptedException {
		Select_2Pizzas select = new Select_2Pizzas(driver);
		waitforExestence(driver,select.get_Select_Meatpizza()).click();
		Thread.sleep(2000);
		waitforExestence(driver, select.get_Select_anotherpizza()).click();

	}

	@Test(priority = 6)
	public void Click_Menu() {
		Click_Home se = new Click_Home(driver);
		se.get_Click_Menu().click();
	}

	@Test(priority = 7)
	public void Select_Drink() throws InterruptedException {
		Select_Drinks drink = new Select_Drinks(driver);
		Thread.sleep(2000);
		drink.get_Click_Drinks().click();
		Thread.sleep(2000);
		waitforExestence(driver, drink.get_Click_Any_Drink_Ctegigory()).click();
	}

	@Test(priority = 8)
	public void Select_Redbull() throws InterruptedException {
		Select_Redbull bull = new Select_Redbull(driver);
		Thread.sleep(2000);
		waitforExestence(driver, bull.get_Select_Redbull()).click();
	}
	@Test(priority = 9)
	public void againClick_Menu() {
		Click_Home se = new Click_Home(driver);
		se.get_Click_Menu().click();}
	@Test(priority = 10)
	public void Click_Desert() throws InterruptedException {
		Desert de=new Desert(driver);
		waitforExestence(driver,de.get_Desert()).click();
		Thread.sleep(2000);
		de.get_Select_Dessert().click();
		String Before_Run=de.get_AddCard_text().getText();
		System.out.println(Before_Run);
		Thread.sleep(2000);
		waitforExestence(driver,de.get_Select_Penut()).click();
		String After_Run=de.get_AddCard_text().getText();
		System.out.println(After_Run);
		
		Assert.assertNotSame(Before_Run, After_Run);
		
		
	}
	
	
	
	

	@Test(priority = 11)
	public void Navigate() {
		driver.navigate().to("https://www.caseys.com/cart");

	}

	@Test(priority = 12)
	public void Clickon_Checkout() throws InterruptedException {
		Checkout check = new Checkout(driver);
		Thread.sleep(2000);
		waitforExestence(driver, check.get_Clickon_Checkout());
		check.get_Clickon_Checkout().click();
		Thread.sleep(2000);	}

	@Test(priority = 13)
	public void click_Guest_Checkout() {
		Guest_Checkout and = new Guest_Checkout(driver);
		waitforExestence(driver, and.get_Click_Guest_Chechout());
		and.get_Click_Guest_Chechout().click();

	}
	@Test(priority = 14)
	public void Enter_Details() {
		Enter_Details name=new Enter_Details(driver);
		waitforExestence(driver,name.get_Enter_Firstname());
		name.get_Enter_Firstname().sendKeys("Saifulla");
	}
	@Test(priority = 15)
	public void surname_Enter_Details() throws InterruptedException {
		Enter_Details sur_name=new Enter_Details(driver);
		Thread.sleep(2000);
		sur_name.get_Enter_Surname().sendKeys("Shaik");
	}
	@Test(priority = 16)
	public void Enter_Email() throws InterruptedException {
		Enter_Details email=new Enter_Details(driver);
		Thread.sleep(2000);
		email.get_Enter_mailid().sendKeys("ssaifulla@mail.com");
	}@Test(priority = 17)
	public void Enter_mobile() throws InterruptedException {
		Enter_Details mobile=new Enter_Details(driver);
		Thread.sleep(2000);
		mobile.get_Enter_Phoneno().sendKeys("8247856324");
	}@Test(priority = 18)
	public void click_Submit() {
		Enter_Details submit=new Enter_Details(driver);
		submit.get_Click_Submit().click();
	}
	//@Test(priority = 19)
	//public void close_browser() {
		//driver.quit();}
	
	@Test
	public static WebElement waitforExestence(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until((ExpectedConditions.visibilityOf(element)));
		return element;
	}

}
