package thinkbrq.dealertrack.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import thinkbrq.dealertrack.pages.dealertrack.HomePage;

public class ResultSearchPage {

private WebDriver driver;
	
	public ResultSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Sempre será o primero botao da pesquisa
	private By firstReuslt = By.xpath("//div[@class='yuRUbf']/a[1]");
	
	public HomePage clickInTheFirstResult() {
		
		driver.findElement(firstReuslt).click();
		
		return new HomePage(driver);
	}
}
