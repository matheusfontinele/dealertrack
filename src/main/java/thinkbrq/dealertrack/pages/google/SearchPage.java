package thinkbrq.dealertrack.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {

	private WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By searchInput = By.cssSelector("input[name=q]");
	
	
	public ResultSearchPage doASearch(String search) {
		
		driver.findElement(searchInput).sendKeys(search);
		
		driver.findElement(searchInput).sendKeys(Keys.ENTER);
		
		return new ResultSearchPage(driver);
	}
}
