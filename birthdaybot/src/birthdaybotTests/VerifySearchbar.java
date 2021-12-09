/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import birthdaybotPages.happyboardPage;

/**
 * @author mop
 *
 */
public class VerifySearchbar {
	
	@Test
	public void verifySearch() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		happyboardPage happyboard=new happyboardPage(driver);

		happyboard.typeSearchBar("Edib");
		
	    String name = "Edib Imamović";
	    
	    if ( driver.getPageSource().contains("Edib")){
	         System.out.println("Text: " + name + " is present. ");
	      } else {
	         System.out.println("Text: " + name + " is not present. ");
	      }
	    
		happyboard.clickSync();

		
		driver.quit();
	}

}
