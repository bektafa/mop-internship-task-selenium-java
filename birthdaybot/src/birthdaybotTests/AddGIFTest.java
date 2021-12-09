/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import birthdaybotPages.birthdaycardsPage;

/**
 * @author mop
 *
 */
public class AddGIFTest {
	
	@Test
	public void verifyAddGIF() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		birthdaycardsPage gifPage=new birthdaycardsPage(driver);

		driver.get("https://birthdaybot.mop.ba/bdaycard");
		
		gifPage.clickAddGIF();
		
		gifPage.typeGIF("https://media.giphy.com/media/s2qXK8wAvkHTO/giphy.gif");
		
		gifPage.clickSubmitGIF();


		
		driver.quit();
	}

}
