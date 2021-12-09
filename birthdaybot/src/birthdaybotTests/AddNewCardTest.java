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
public class AddNewCardTest {
	
	
	@Test
	public void verifyAddCard() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		birthdaycardsPage bdayPage=new birthdaycardsPage(driver);

		driver.get("https://birthdaybot.mop.ba/bdaycard");
		
		bdayPage.clickAddCard();
		
		bdayPage.typeMessage("testtest");
		
		bdayPage.clickSubmitCard();
		
		String card = "testtest";
	    
	    if ( driver.getPageSource().contains("test")){
	         System.out.println("Text: " + card + " is present. ");
	      } else {
	         System.out.println("Text: " + card + " is not present. ");
	      }


		
		driver.quit();
	}

}
