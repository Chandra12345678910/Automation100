package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Googlesearchsteps {
	
	
	
	@Given("broweser is open")
	public void broweser_is_open() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
				
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on serach page")
	public void user_is_on_serach_page() {
		
		
	
	}

	@And("user enters text in search box")
	public void user_enters_text_in_search_box() {
		driver.findElement(By.id("input")).sendKeys("abc@gmail.com");
	}

	@And("user cliks eneter")
	public void user_cliks_eneter() {
		driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
	}

	@Then("search results displayed")
	public void search_results_displayed() {
	   
	}
}
