package birthdaybotPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author mop
 *
 */

public class birthdaycardsPage {

	
WebDriver driver;
	
	By addCard=By.xpath("//*[@id=\"react-tabs-21\"]/div/div/button");
	By message=By.name("message");
	By submitCard=By.xpath("//*[@id=\"react-tabs-21\"]/div/div/div/div[2]/form/div[2]/div[2]/input");
	
	By GifsPage=By.id("react-tabs-22");
	
	By addGIF=By.xpath("//*[@id=\"react-tabs-23\"]/div/div[1]/button");
	By GIFlink=By.name("gif");
	By submitGIF=By.xpath("//*[@id=\"react-tabs-23\"]/div/div[1]/div/div[2]/form/div[2]/div[2]/input");

	
	
	public birthdaycardsPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public void clickGifsPage() {
		
		driver.findElement(GifsPage).click();
		
	}
	
	public void clickAddCard() {
		
		driver.findElement(addCard).click();
		
	}
	
	public void typeMessage(String mid) {
		
		driver.findElement(message).sendKeys(mid);
		
	}
	
	public void clickSubmitCard() {
		
		driver.findElement(submitCard).click();
		
	}
	
	public void clickAddGIF() {
		
		driver.findElement(addGIF).click();
		
	}
	
	public void typeGIF(String gid) {
		
		driver.findElement(GIFlink).sendKeys(gid);
		
	}
	
	public void clickSubmitGIF() {
		
		driver.findElement(submitGIF).click();
		
	}
	
}
