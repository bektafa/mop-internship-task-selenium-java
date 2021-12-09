/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import birthdaybotPages.happyboardPage;

/**
 * @author mop
 *
 */
public class LogoutTest {
	
	
	@Test
	public void verifyLogout() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		happyboardPage happyboard=new happyboardPage(driver);

		happyboard.clickLogout();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://birthdaybot.mop.ba" );

		
		driver.quit();
	}

}
