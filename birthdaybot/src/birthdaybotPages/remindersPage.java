/**
 * 
 */
package birthdaybotPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


/**
 * @author mop
 *
 */
public class remindersPage {
	
	WebDriver driver;
	
	By addReminder=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/button");
	By daysBefore=By.name("days");
	By submitBtn=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input");

	
	
	public remindersPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void clickAddReminder() {
		
		driver.findElement(addReminder).click();
		
	}
	
	public void typeDaysBefore(String dys) {
		
		driver.findElement(daysBefore).sendKeys(dys);
		
	}
	
	public void clickSubmitBtn() {
		
		driver.findElement(submitBtn).click();
		
	}
}
