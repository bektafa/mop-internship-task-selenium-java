/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import birthdaybotPages.happyboardPage;

/**
 * @author mop
 *
 */
public class FilterTest {

	
	@Test
	public void verifyFilter() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		happyboardPage happyboard=new happyboardPage(driver);

		happyboard.clickFilter();
		
		Select drpMonth=new Select(driver.findElement(By.name("month")));
		drpMonth.selectByVisibleText("March");
		
		happyboard.clickApply();
		
		String name = "Meliha Dejkić";
	    
	    if ( driver.getPageSource().contains("Meliha")){
	         System.out.println("Text: " + name + " is present. ");
	      } else {
	         System.out.println("Text: " + name + " is not present. ");
	      }

		
		driver.quit();
	}
	
}
