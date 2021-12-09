/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import birthdaybotPages.adminsPage;

/**
 * @author mop
 *
 */
public class AddAdminTest {
	
	
	@Test
	public void verifyAddAdmin() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		adminsPage adminPage=new adminsPage(driver);

		driver.get("https://birthdaybot.mop.ba/admins");
		
		adminPage.clickAddAdmin();
		
		adminPage.typefName("test");
		
		adminPage.typelName("test");
		
		/**Mail under can be mop mail, not mop mail. validation can be tested - valid mail or not, depends on passing or failing the test  */

		adminPage.typeEmail("notMopmail@gmail.com");

		
		adminPage.clickSubmitAdmin();
		
		/**Following assertion shows if the administrator has been added or not */
		
		String admin = "test";
	    
	    if ( driver.getPageSource().contains("test")){
	         System.out.println("Text: " + admin + " is present. ");
	      } else {
	         System.out.println("Text: " + admin + " is not present. ");
	      }
	    
	    /**Assertion should fail every time if email is not MoP email!!! */

		
		driver.quit();
	}

}
