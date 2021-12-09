/**
 * 
 */
package birthdaybotTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import birthdaybotPages.remindersPage;

/**
 * @author mop
 *
 */
public class AddReminderTest {
	
	
	@Test
	public void addReminder() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mop/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		VerifyLogin login=new VerifyLogin(driver);
		
		login.verifyValidLogin();
		
		driver.get("https://birthdaybot.mop.ba/reminders");
		
		remindersPage reminders=new remindersPage(driver);

		
		reminders.clickAddReminder();
		
		reminders.typeDaysBefore("12");
		
		reminders.clickSubmitBtn();
		
		String reminder = "Send me a reminder 12 day(s) before at 09:00";
	    
	    if ( driver.getPageSource().contains("12 day(s)")){
	         System.out.println("Text: " + reminder + " is present. ");
	      } else {
	         System.out.println("Text: " + reminder + " is not present. ");
	      }

		
		driver.quit();
	}

}
