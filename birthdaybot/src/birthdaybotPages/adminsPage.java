/**
 * 
 */
package birthdaybotPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author mop
 *
 */
@SuppressWarnings("unused")
public class adminsPage {
	
	
	WebDriver driver;
	
	By addAdmin=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/button");
	By firstname=By.name("firstName");
	By lastName=By.name("lastName");
	By email=By.name("email");
	By submitAdmin=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/div[4]/input");
	By table=By.className("userTable");
	
	public adminsPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	/**
	public List<WebElement> tableList() {
		
		return driver.findElements(table);
		
	} */
	
	public void clickAddAdmin() {
		
		driver.findElement(addAdmin).click();
		
	}
	
	public void typefName(String fid) {
		
		driver.findElement(firstname).sendKeys(fid);
		
	}
	
	public void typelName(String lid) {
		
		driver.findElement(lastName).sendKeys(lid);
		
	}

	public void typeEmail(String emid) {
	
		driver.findElement(email).sendKeys(emid);
	
}
	public void clickSubmitAdmin() {
		
		driver.findElement(submitAdmin).click();
		
	}

}
