package org.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition {

	static WebDriver driver;

	@Given("user launches the Adactin Hotel app")
	public void user_launches_the_Adactin_Hotel_app() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("user enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.name("login")).click();
	}

	
	@And("user selects the {string}")
	public void user_selects_the(String string) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement location = driver.findElement(By.name("location"));
		Select l = new Select(location);
		l.selectByVisibleText(string);
	}

	
	@And("name of the {string}")
	public void name_of_the(String string) {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h = new Select(hotel);
		h.selectByVisibleText(string);
	}
	
	
	@And("type of {string}")
	public void type_of(String string) {
		WebElement room = driver.findElement(By.id("room_type"));
		Select r = new Select(room);
		r.selectByVisibleText(string);
	}


	@And("no of {string}")
	public void no_of(String string) {
		WebElement noOfRoom = driver.findElement(By.id("room_nos"));
		Select n = new Select(noOfRoom);
		n.selectByVisibleText(string);
	}
	

	@And("adult per room {string}")
	public void adult_per_room(String string) {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select a = new Select(adult);
		a.selectByVisibleText(string);
	}
	
	@And("child per room {string}")
	public void child_per_room(String string) {
		WebElement child = driver.findElement(By.id("child_room"));
		Select c = new Select(child);
		c.selectByVisibleText(string);
	}
	

	@And("enters the {string} and {string}")
	public void enters_the_and(String string, String string2) {
		driver.findElement(By.name("datepick_in")).sendKeys(string);
		driver.findElement(By.name("datepick_out")).sendKeys(string2);
	}

	@And("confirms the Hotel")
	public void confirms_the_Hotel() {
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
	}

	@And("enters the {string},{string},{string}")
	public void enters_the(String string, String string2, String string3) {
		driver.findElement(By.name("first_name")).sendKeys(string);
		driver.findElement(By.name("last_name")).sendKeys(string2);
		driver.findElement(By.name("address")).sendKeys(string3);
	}

	@And("enter {string} {string}")
	public void enter(String string, String string2) {
		WebElement ccNum = driver.findElement(By.name("cc_num"));
		ccNum.sendKeys(string);
		
		WebElement cct = driver.findElement(By.name("cc_type"));
		Select cctype = new Select(cct);
		cctype.selectByVisibleText("VISA");
		
		WebElement ccxp = driver.findElement(By.name("cc_exp_month"));
		Select xpdate = new Select(ccxp);
		xpdate.selectByIndex(12);
		
		WebElement ccxpyear = driver.findElement(By.name("cc_exp_year"));
		Select xpyear = new Select(ccxpyear);
		xpyear.selectByIndex(12);
		
		WebElement ccvNum = driver.findElement(By.name("cc_cvv"));
		ccvNum.sendKeys(string2);
	}

	@Then("confirms the booking")
	public void confirms_the_booking() {
		driver.findElement(By.name("book_now")).click();
		String title = driver.getTitle();
		boolean contains = title.contains(title);
		Assert.assertTrue(contains);
		System.out.println("Hotel Booking confirmation");
	}

}
