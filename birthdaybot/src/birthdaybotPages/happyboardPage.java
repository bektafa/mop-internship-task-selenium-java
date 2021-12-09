/**
 * 
 */
package birthdaybotPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author mop
 *
 */
public class happyboardPage {
	
	WebDriver driver;
	
	By searchbar=By.xpath("/html/body/div/div/div/div[2]/input");
	By sync=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/button[1]/svg");
	By filter=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/button[2]/svg");
	
	Select drpMonth=new Select(driver.findElement(By.name("month")));
	/** drpMonth.selectByVisibleText("month"); - use in tests package*/
	
	By applyFilter=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/form/div[2]/button[1]");
	
	By logout=By.xpath("//*[@id=\"root\"]/div/div/div[1]/a");
	
	
	public happyboardPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void typeSearchBar(String sid) {
		
		driver.findElement(searchbar).sendKeys(sid);
		
	}
	
	public void clickSync() {
		
		driver.findElement(sync).click();
		
	}
	
	public void clickLogout() {
		
		driver.findElement(logout).click();
		
	}
	
	public void clickFilter() {
		
		driver.findElement(filter).click();
		
	}
	
	public void clickApply() {
		
		driver.findElement(applyFilter).click();
		
	}

}
