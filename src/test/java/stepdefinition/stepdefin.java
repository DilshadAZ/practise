package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
public class stepdefin {
	WebDriver driver;
	WebElement ooo;
	@Given("^Open URL$")
	public void open_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("-remote-allow-origin*=");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();    
	}

	@Then("^Click dropdown$")
	public void click_dropdown() throws Throwable {
		WebElement ooo = driver.findElement(By.id("searchDropdownBox"));
		Select sl = new Select(ooo);
		sl.selectByValue("search-alias=amazonfresh");
		Thread.sleep(3000);
	
	}

	@Then("^Click search button$")
	public void click_search_button() throws Throwable {
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(3000);
	    
	    driver.close();
	}


}
