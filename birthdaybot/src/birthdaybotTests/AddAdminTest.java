/**
 * 
 */
package birthdaybotTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
		
		/**List<WebElement> rows = adminPage.tableList();
		
		for (int i = 0; i < rows.size(); i++) {
		    // for loop to access individual row
		    WebElement currentRow = rows.get(i);
		    // sad perform any action with current row
		} */
		
		
		try {
			
		adminPage.clickAddAdmin();
		
		adminPage.typefName("test");
		
		adminPage.typelName("test");
		
		/**Mail under can be mop mail, not mop mail. validation can be tested - valid mail or not, depends on passing or failing the test  */

		adminPage.typeEmail("notMopmail@gmail.com");

		
		adminPage.clickSubmitAdmin();
		
		if (driver.findElement(By.name("firstName")).isDisplayed()) {
            List<WebElement> resultList = driver.findElements(By.name("firstName"));
            for (WebElement result : resultList) {
                Assert.assertTrue(result.getText().toLowerCase().contains("test"));
            }
        }
		
		/**Following assertion shows if the administrator has been added or not */
		
		String admin = "test";
	    
	    if ( driver.getPageSource().contains("test")){
	         System.out.println("Text: " + admin + " is present. ");
	      } else {
	         System.out.println("Text: " + admin + " is not present. ");
	      }
	    
	    /**Assertion should fail every time if email is not MoP email!!! */
	    
	    
		}

		catch (Exception e) {

		System.out.println(e.getMessage());

		}
		
		String expectedUrl = "https://birthdaybot.mop.ba/admins";
		driver.get(expectedUrl);
		try {
		   Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
		   System.out.println("Navigated to correct webpage");
		} catch (Throwable pageNavigationError) {
		   System.out.println("Didn't navigate to correct webpage");
		}
		
		
		String ActualTitle = driver.getTitle();
	    String ExpectedTitle = "Birthday Bot";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	      
	      
		driver.close();
		
		driver.quit();
	}
	

}
